import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        int day = score.length;
        
        int[] answer = new int[day];
        
        LinkedList<Integer> li = new LinkedList<>();
        
        for(int i = 0; i < day; i++){
            li.add(score[i]);
            
            Collections.sort(li);
            
            if(li.size() > k){
                li.removeFirst();
            }
            
            answer[i] = li.peekFirst();
        }
        
        return answer;
    }
}