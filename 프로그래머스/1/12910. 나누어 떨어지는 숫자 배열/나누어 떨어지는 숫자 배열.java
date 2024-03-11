import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        Arrays.sort(arr);
        
        List<Integer> li = new ArrayList<>();
        
        for(int i : arr){
            if(i % divisor == 0){
                li.add(i);
            }
        }
        
        if(li.isEmpty()){
            li.add(-1);
        }
        answer = li.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}