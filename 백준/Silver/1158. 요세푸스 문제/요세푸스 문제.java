import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=1; i<=N; i++){
            queue.offer(i);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        
        while(queue.size() > 0){
            
            for(int i = 0; i < K-1; i++){
                 queue.offer(queue.poll());   
            }
            
            sb.append(queue.poll()).append(", ");
        }
        
        int idx = sb.lastIndexOf(",");
		StringBuilder sb2 = new StringBuilder(sb.substring(0,idx));
		sb2.append(">");
        System.out.println(sb2);
    }
}