import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, ArrayList<String>> singo_to = new HashMap<>(); // 신고한 사람목록

        Map<String, Integer> singo_from = new HashMap<>(); // 신고 당한 횟수

        Map<String,Integer> result_map = new HashMap<>(); // 메일 받은 횟수
        // id 목록 초기화
        for(String id : id_list){
            singo_to.put(id,new ArrayList<String>());
            singo_from.put(id,0);
            result_map.put(id,0);
        }

        // 신고 횟수 세기
        StringTokenizer st;
        for(String r : report){
            st = new StringTokenizer(r);

            String from = st.nextToken();

            String to = st.nextToken();

            ArrayList<String> s = singo_to.get(from);

            if(!s.contains(to)){
                s.add(to);

                int cnt = singo_from.get(to);

                singo_from.replace(to,cnt+1);
            }
        }

        // 메일 받은 횟수 세기
        for(Map.Entry<String,Integer> entry : singo_from.entrySet()){

            if(entry.getValue() >= k){

                String crime = entry.getKey();

                for(Map.Entry<String, ArrayList<String>> e : singo_to.entrySet()){

                    ArrayList<String> s = e.getValue();

                    if(s.contains(crime)){
                        int cnt = result_map.get(e.getKey())+1;
                        result_map.replace(e.getKey(),cnt);
                    }
                }
            }
        }

        for(int i=0; i<id_list.length; i++){
            int count = result_map.get(id_list[i]);
            answer[i] = count;
        }
        return answer;
    }
}