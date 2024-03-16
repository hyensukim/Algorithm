import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String,Integer> map = new HashMap<>();
        
        int idx = 0;
        for(String p : players){
            map.put(p,idx++);
        }
        
        for(String call : callings){
            int rank = map.get(call); // 3
            
            String front = players[rank-1];
            
            int p_rank = map.replace(call,rank-1);
            
            int front_rank = map.replace(front,p_rank);
            
            players[front_rank] = call;
            
            players[p_rank] = front;
        }
        
        for(Map.Entry<String,Integer> e : map.entrySet()){
            answer[e.getValue()] = e.getKey();
        }
        
        
        
        
//         LinkedList<String> li = new LinkedList<>();
//         for(String p : players){
//             li.offer(p);
//         }
        
//         for(String call : callings){
//             int idx = li.indexOf(call);
//             li.remove(idx);
//             li.add(idx-1,call);
//         }
        
//         for(int i=0; i<answer.length; i++){
//             answer[i] = li.poll();
//         }
        
        return answer;
    }
}