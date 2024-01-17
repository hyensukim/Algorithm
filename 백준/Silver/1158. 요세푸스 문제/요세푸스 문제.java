import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class Main{
    public static void main(String[] argas)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i <= N; i++){
            q.offer(i);
        }
        
        StringBuilder sb = new StringBuilder("<");
        while(!q.isEmpty()){
            for(int i=0; i < K-1; i++){
                q.offer(q.poll());
            }
            Integer i = q.poll();
            sb.append(i).append(", ");
        }
        
        sb.replace(sb.length()-2,sb.length(),">");
        System.out.println(sb);
    }
}