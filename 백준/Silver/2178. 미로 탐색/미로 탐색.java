import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main{
    static int[][] graph;
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new int[N][M];
        
        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<M; j++){
                graph[i][j] = line.charAt(j) - '0';
            }
        }
        bfs();
        System.out.println(graph[N-1][M-1]);
    }
    
    static void bfs(){
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Queue<int[]> que = new ArrayDeque<>();
        que.offer(new int[]{0,0});
        while(!que.isEmpty()){
            int[] now = que.poll();
            int x = now[0];
            int y = now[1];
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx < 0 || ny < 0 || nx >= graph.length || ny >= graph[0].length){
                    continue;
                }
                if(graph[nx][ny] == 1){
                    graph[nx][ny] += graph[x][y];
                    que.offer(new int[]{nx,ny});
                }
            }
        }
    }
}