import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        ArrayList<Integer> li = new ArrayList<>();
        
        int len = numbers.length;
        
        for(int i = 0; i < len-1; i++){
            for(int j = i + 1; j < len; j++){
                
                int tmp = numbers[i] + numbers[j];
                
                if(li.indexOf(tmp) == -1){
                    li.add(tmp);
                }
            }
        }
        
        Collections.sort(li);
        
        answer = li.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}