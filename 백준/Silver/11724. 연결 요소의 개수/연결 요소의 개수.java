import java.io.*;
import java.util.*;

public class Main{
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 정점
        
        int m = Integer.parseInt(st.nextToken()); // 간선
        
        visited = new boolean[n+1]; // 방문 배열 초기화
        
         graph = new ArrayList[n+1]; // 인접 리스트
        
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<Integer>(); // 초기화
        }
        
        // 인접 리스트에 그래프 값 초기화
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            
            int u = Integer.parseInt(st.nextToken());
            
            int v = Integer.parseInt(st.nextToken());
            
            graph[u].add(v);
            
            graph[v].add(u);
        }
        
        int result = 0;
        
        for(int i=1; i<=n; i++){
            if(!visited[i]){
                result++;
                dfs(i);
            }
        }
        
        br.close();
        
        System.out.println(result);
    }
    
    static void dfs(int x){
        if(visited[x])
            return;
        
        visited[x] = true;
        
        for(int f : graph[x]){
            if(!visited[f]){
                dfs(f);
            }
        }
    }
}