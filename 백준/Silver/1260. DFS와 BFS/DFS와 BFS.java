import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 노드
        int m = Integer.parseInt(st.nextToken()); // 에지
        int v = Integer.parseInt(st.nextToken()); // 시작점
        
        arr = new ArrayList[n+1];
        
        for(int i=1; i <= n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i < m ; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        
        br.close();
        
        for(int i=1; i <= n; i++){
            Collections.sort(arr[i]);
        }
        
        visited = new boolean[n+1];
        dfs(v);
        sb.append("\n");
        Arrays.fill(visited,false);
        bfs(v);
        
        System.out.print(sb);
    }
    
    static void dfs(int node){
        sb.append(node).append(" ");
        visited[node] = true;
        
        for(int sub : arr[node]){
            if(!visited[sub]){
                dfs(sub);
            }
        }
    }
    
    static void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        
        while(!queue.isEmpty()){
            int nowNode = queue.poll();
            sb.append(nowNode).append(" ");
            for(int sub : arr[nowNode]){
                if(!visited[sub]){
                    visited[sub] = true;
                    queue.add(sub);
                }
            }
        }
    }
}