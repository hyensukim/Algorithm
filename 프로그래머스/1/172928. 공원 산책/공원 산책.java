import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        int len = park.length;

        char[][] area = new char[len][];

        for(int i=0; i<len; i++){

            area[i] = park[i].toCharArray();

            for(int j=0; j<area[i].length; j++){
                char ch = area[i][j];

                if(ch == 'S'){
                    answer[0] = i; // 0
                    answer[1] = j; // 1
                }
            }
        }

        StringTokenizer st;
        for(String route : routes){
            st = new StringTokenizer(route);

            String arrow = st.nextToken(); // E

            int cnt = Integer.parseInt(st.nextToken()); // 2

            // x 1
            // y 0
            int x = answer[1], y = answer[0]; 
            for(int i=0; i<cnt; i++){ //2 1
                switch(arrow){
                    case "N" :
                        y--;
                        break;
                    case "S" :
                        y++;
                        break;
                    case "W" :
                        x--;
                        break;
                    case "E" : // 0 0
                        x++; // x : 2 3
                        break;
                }
                // x 2 3
                // y 0 0
                if(x >= 0 && y >= 0 && y <area.length && x < area[0].length){ // area.length : 4, area[0].length : 3
                    if(area[y][x] == 'X'){
                        break;
                    }
                    else if(i == cnt-1){
                        answer[0] = y;// 0
                        answer[1] = x;// 2
                    }
                }
            }
        }

        return answer;
    }
}