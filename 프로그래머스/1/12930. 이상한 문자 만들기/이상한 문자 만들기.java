import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        
        String[] arr = s.split("");
        
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(" ".equals(arr[i])){
                idx = 0;
            }
            else if(idx % 2 == 0){
                arr[i] = arr[i].toUpperCase();
                idx++;
            }
            else if(idx % 2 == 1){
                arr[i] = arr[i].toLowerCase();
                idx++;
            }
            
            answer += arr[i];
        }
        
        return answer;
    }
}