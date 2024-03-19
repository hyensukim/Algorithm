import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        
        // 최소 횟수 초기화
        for(String key : keymap){
            int key_cnt = 0;
            
            for(String s : key.split("")){
                key_cnt++;
                
                if(Objects.isNull(map.get(s)) || map.get(s) > key_cnt){
                    map.put(s,key_cnt);
                }
            }
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        
        // 횟수 세기
        for(String target : targets){
            int sum = 0;
            
            for(String s : target.split("")){
                if(Objects.isNull(map.get(s))){
                    sum = -1;
                    break;
                }else{
                    sum += map.get(s);
                }
            }
            
            li.add(sum);
        }
        
        answer = li.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}