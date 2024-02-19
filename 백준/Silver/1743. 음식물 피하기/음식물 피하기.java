import java.io.*;
import java.util.*;

public class Main{
    static int N, M, count, max;
    static boolean[][] map, visited;
    static int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken()); //세로 길이
        M = Integer.parseInt(st.nextToken()); //가로 길이
        int K = Integer.parseInt(st.nextToken()); //음식물 갯수
        
        map = new boolean[N][M]; // 쓰레기 좌표
        visited = new boolean[N][M]; // 방문 여부
        
        for(int i=0; i < K; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken()) -1;
            int c = Integer.parseInt(st.nextToken()) -1;
            map[r][c] = true;
        }
        br.close();
        
        count = 0; max = 0;
        for(int i=0; i < N; i++){
            for(int j=0; j < M; j++){
                if(!visited[i][j] && map[i][j]){
                    dfs(i,j);
                    max = Math.max(count, max);
                    count = 0;
                }
            }
        }
        
        System.out.println(max);
    }
    
    static void dfs(int r, int c){
        visited[r][c] = true;
        count++;
        
        for(int i=0; i < 4; i++){
            int nowX = r + dx[i];
            int nowY = c + dy[i];
            
            if(nowX >= 0 && nowY >= 0 && nowX < N && nowY < M){
                if(!visited[nowX][nowY] && map[nowX][nowY]){
                    dfs(nowX,nowY);
                }
            }
        }
    }
}