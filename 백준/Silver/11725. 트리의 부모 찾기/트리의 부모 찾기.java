import java.io.*;
import java.util.*;

public class Main{
    static ArrayList<Integer>[] tree;
    static boolean[] visited;
    static int[] answer;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        tree = new ArrayList[n+1]; // 인접 리스트

        visited = new boolean[n+1]; // 방문 배열

        answer = new int[n+1]; // 결과

        for(int i=0; i<=n; i++){
            tree[i] = new ArrayList<Integer>();
        }

        for(int i=1; i<n; i++){
            String[] sa = br.readLine().split(" ");
            tree[Integer.parseInt(sa[0])].add(Integer.parseInt(sa[1]));
            tree[Integer.parseInt(sa[1])].add(Integer.parseInt(sa[0]));
        }

        for(int i=1; i<=n; i++){
            dfs(i);
        }

        for(int i=2; i<=n; i++){
            sb.append(answer[i]).append("\n");
        }

        br.close();

        System.out.println(sb);
    }

    static void dfs(int n){
        if(visited[n])
            return;

        visited[n] = true;

        for(Integer child : tree[n]){
            if(!visited[child]){
                answer[child] = n;
                dfs(child);
            }
        }
    }
}