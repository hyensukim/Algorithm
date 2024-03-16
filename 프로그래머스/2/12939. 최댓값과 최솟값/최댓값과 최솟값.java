import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringTokenizer st = new StringTokenizer(s);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        while(st.hasMoreTokens()){
            int i = Integer.parseInt(st.nextToken());
            if(i < min){
                min = i;
            }
            
            if(i > max){
                max = i;
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}