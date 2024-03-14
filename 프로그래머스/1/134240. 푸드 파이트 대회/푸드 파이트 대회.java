import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb;
        
        int idx = 0;
        
        for(int f : food){
            
            int one = f / 2; // 1인분
            
            for(int i=0; i<one;i++){
                answer+=idx;
            }
            
            idx++;
        }
        
        sb = new StringBuilder(answer);
        
        answer += ("0" + sb.reverse().toString());
        
        return answer;
    }
}