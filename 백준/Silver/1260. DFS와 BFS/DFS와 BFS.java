import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        
        arr = new ArrayList[n+1];
        
        for(int i=1; i<=n; i++){
            arr[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arr[s].add(e);
            arr[e].add(s);
        }
        br.close();
        
        for(int i=1; i<=n; i++){
            Collections.sort(arr[i]);
        }
        
        visited = new boolean[n+1];
        dfs(v);
        Arrays.fill(visited,false);
        sb.deleteCharAt(sb.length()-1).append("\n");
        bfs(v);
        
        System.out.print(sb);
    }
    
    static void dfs(int node){
        /*
        출력창에 현재 노드 더하기
        방문 배열에 표시
        
        인접 노드 확인하여 방문하지 않은 경우, 깊이우선탐색 수행
        */
        sb.append(node).append(" ");
        visited[node] = true;
        
        for(int sub : arr[node]){
            if(!visited[sub]){
                dfs(sub);
            }
        }
    }
    
    static void bfs(int node){
        /*
        큐 생성 후 노드를 큐에 담고, 방문 배열에 표시
        
        큐가 빌 때까지 루프를 돌리고, 그 안에서 현재 노드를 큐에서 빼낸 뒤 출력창에 더해준다.
        
        인접 노드를 방문 여부를 확인 후 큐에 담고, 방문 배열에 표시한다.        
        */
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);
        visited[node] = true;
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            sb.append(now).append(" ");
            
            for(int sub : arr[now]){
                if(!visited[sub]){
                    visited[sub] = true;
                    queue.add(sub);
                }
            }
        }
    }
}