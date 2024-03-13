import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = {};
        
        int[] tmpArr;
        
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int t=0; t<commands.length; t++){
            int i = commands[t][0] -1;
            
            int j = commands[t][1] -1;
            
            int k = commands[t][2] -1;
            
            tmpArr = Arrays.copyOfRange(array, i, j + 1); // i ~ j 복사
            
            Arrays.sort(tmpArr);
            
            li.add(tmpArr[k]);
        }
        
        answer = li.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}