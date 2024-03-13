import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        char[] charArr = s.toCharArray();
        
        ArrayList<Character> li = new ArrayList<>();
        
        int idx = 0;
        for(char ch : charArr){
            
            int find_idx = li.lastIndexOf(ch);
            
            if(find_idx == -1){
                answer[idx] = find_idx;
            }
            else{
                answer[idx] = idx - find_idx;
            }
            
            li.add(ch);
            
            idx++;
        }
        
        return answer;
    }
}