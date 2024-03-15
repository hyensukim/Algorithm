import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] baby_balum = {"aya", "woo", "ye", "ma"};
        
        ArrayList<String> li = new ArrayList<>();
        
        for(String b : babbling){
            String tmp = b;
                                   
            for(String bb : baby_balum){
                
                if(tmp.contains(bb+bb))
                    continue;
                
                b = b.replaceAll(bb," ");
            }
            
            b = b.replaceAll(" ","");
            if(b.isEmpty()){
                answer++;
                // li.add(tmp);
            }
        }
        
        
        return answer;
    }
}