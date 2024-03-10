import java.io.*;
import java.util.*;

public class Main{
    static boolean[] visited;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int node = Integer.parseInt(str[0]);
        int edge = Integer.parseInt(str[1]);
        ArrayList<Integer>[] li = new ArrayList[node + 1]; // 인접 리스트
        visited = new boolean[node + 1]; // 방문 배열
        int linkedFactor = 0;
        
        for(int i=1; i <= node; i++){
            li[i] = new ArrayList<Integer>();
        }
        
        for(int i=0; i < edge; i++){
            str = br.readLine().split(" ");
            int u = Integer.parseInt(str[0]);
            int v = Integer.parseInt(str[1]);
            li[u].add(v);
            li[v].add(u);
        }
        br.close();
        
        for(int i=1; i <= node; i++){
            if(!visited[i]){
                linkedFactor++;
                dfs(li, i);
            }
        }
        System.out.println(linkedFactor);
    }
    
    static void dfs(ArrayList<Integer>[] li,int node){
        if(visited[node])
            return;
        
        visited[node] = true;
        
        if(li[node].isEmpty())
            return;
        
        for(int j = 0; j < li[node].size(); j++){
            int idx = li[node].get(j);
            if(!visited[idx])
                dfs(li,idx);
        }
    }
}