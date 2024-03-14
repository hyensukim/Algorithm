import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] count = new int[3];
        
        int[][] supoja = new int[3][];
        
        supoja[0] = new int[]{1,2,3,4,5,1,2,3,4,5};
        
        supoja[1] = new int[]{2,1,2,3,2,4,2,5,2,1};
        
        supoja[2] = new int[]{3,3,1,1,2,2,4,4,5,5};
        
        for(int answer : answers){
            for(int i=0; i<10; i++){
                if(supoja[0][i] == answer){
                    count[0]++;
                }
                else if(supoja[1][i] == answer){
                    count[1]++;
                }
                else if(supoja[2][i] == answer){
                    count[2]++;
                }
            }
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