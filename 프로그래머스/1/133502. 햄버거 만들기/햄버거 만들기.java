import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        LinkedList<Integer> li = new LinkedList<>();
    
        for(int i : ingredient){
            li.offerLast(i);
            
            if(li.size() >= 4){
                if(li.get(li.size() - 4) == 1 &&
                   li.get(li.size() - 3) == 2 &&
                   li.get(li.size() - 2) == 3 &&
                   li.get(li.size() - 1) == 1){
                    answer++;
                    for(int j=0; j<4; j++)
                        li.pollLast();
                }
            }
        }
        
        return answer;
    }
}