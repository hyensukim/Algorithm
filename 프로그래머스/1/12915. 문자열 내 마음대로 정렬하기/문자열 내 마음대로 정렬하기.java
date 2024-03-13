import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, new Comparator<String>(){
            
            @Override
            public int compare(String o1, String o2){
                
                char ch1 = o1.charAt(n);
                
                char ch2 = o2.charAt(n);
                
                if(ch1 == ch2){
                    return o1.compareTo(o2);
                }
                else{
                    return ch1 - ch2;
                }
            }
            
        });
        
        answer = strings;
        
        return answer;
    }
}