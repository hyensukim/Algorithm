import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        // 개인정보 n, 오늘 날짜로 파기할 개인정보 번호
        // 모든 달이 28일까지 있다고 가정
        // 오늘 기준으로 이전이면 파기 -> 기록

        // String[] t = today.split(".");

        Map<String,Integer> map = new HashMap<>();

        StringTokenizer st;

        String[] today_part = today.split("\\.");

        String[] start_part;

        for(String s : terms){
            st = new StringTokenizer(s," ");
            map.put(st.nextToken(), Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> li = new ArrayList<>();

        int idx = 0;
        for(String s : privacies){
            st = new StringTokenizer(s," ");

            String start = st.nextToken();

            start_part = start.split("\\.");

            int duration = map.get(st.nextToken());

            int y = Integer.parseInt(start_part[0]);
            int m = duration + Integer.parseInt(start_part[1]);
            int d = Integer.parseInt(start_part[2]);

            // duration 반영
            while(m > 12){
                y++;
                m -= 12;
            }

            // -1 day 반영
            if(d == 1 && m == 1){
                y--;
                m=12;
                d=28;
            }
            else if( d == 1){
                m--;
                d=28;
            }
            else{
                d--;
            }

            // 비교하기

            int t_y = Integer.parseInt(today_part[0]);
            int t_m = Integer.parseInt(today_part[1]);
            int t_d = Integer.parseInt(today_part[2]);

            if(t_y > y){
                li.add(idx+1);
            }
            else if(t_y == y && t_m > m){
                li.add(idx+1);
            }
            else if(t_y == y && t_m == m && t_d > d){
                li.add(idx+1);
            }

            idx++;
        }

        answer = li.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}