import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] count = new int[3];
        
        int[] supoja1 = {1,2,3,4,5};
        
        int[] supoja2 = {2,1,2,3,2,4,2,5};
        
        int[] supoja3 = {3,3,1,1,2,2,4,4,5,5};
        
       for(int i = 0; i < answers.length; i++){
           if(answers[i] == supoja1[i % 5]) count[0]++;
           if(answers[i] == supoja2[i % 8]) count[1]++;
           if(answers[i] == supoja3[i % 10]) count[2]++;
       }
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<3; i++){
            if(max < count[i]){
                max = count[i];
            }
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i=0; i<3; i++){
            if(max == count[i]){
                li.add(i+1);
            }
        }
        
        int[] answer = li.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}