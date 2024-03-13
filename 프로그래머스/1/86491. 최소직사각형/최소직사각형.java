import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int w = Integer.MIN_VALUE; // 명함 가로
        
        int h = Integer.MIN_VALUE; // 명함 세로
        
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
            
            if(w < sizes[i][0]){
                w = sizes[i][0];
            }
            
            if(h < sizes[i][1]){
                h = sizes[i][1];
            }
        }
        
        answer = w * h;
        
        return answer;
    }
}