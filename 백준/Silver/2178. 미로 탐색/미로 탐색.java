import java.io.*;
import java.util.*;

public class Main{
    static boolean[][] visited;
    static int[][] arr;
    static int[] dr = {0,1,-1,0};
    static int[] dc = {1,0,0,-1};
    static int n,m;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 행 -
        m = Integer.parseInt(st.nextToken()); // 열 |
        
        visited = new boolean[n][m];
        arr = new int[n][m];
        
        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(str.charAt(j) + "");
            }
        }
        br.close();
        
        bfs(0,0);
        
        System.out.println(arr[n-1][m-1]);
    }
    
    static void bfs(int r, int c){
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {r,c});
        visited[r][c] = true;
        
        while(!queue.isEmpty()){
            int[] now= queue.poll();
            
            for(int i=0; i<4; i++){
                int tmp_row = now[0] + dr[i];
                int tmp_col = now[1] + dc[i];
                
                if(tmp_row >= 0 && tmp_col >= 0 && tmp_row < n && tmp_col < m){
                    if(arr[tmp_row][tmp_col] != 0 && !visited[tmp_row][tmp_col]){
                        visited[tmp_row][tmp_col] = true;
                        arr[tmp_row][tmp_col] = arr[now[0]][now[1]] + 1;
                        queue.offer(new int[] {tmp_row, tmp_col});
                    }
                }
            }
        }
    }
}