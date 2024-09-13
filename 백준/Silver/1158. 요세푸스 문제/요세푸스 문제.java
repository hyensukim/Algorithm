import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        
        int n = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++) {
            q.offer(i);
        }
        
        Queue<Integer> answer = new LinkedList<>();
        int k = Integer.parseInt(st.nextToken());
        while(!q.isEmpty()){
            if(q.peek() == null){
                break;
            }
            
            for(int i=0; i<k-1; i++) {
                q.offer(q.poll());
            }
            
            answer.offer(q.poll());
        }
        br.close();
        
        while(answer.size() > 1) {
            sb.append(answer.poll());
            sb.append(", ");
        }
        sb.append(answer.poll()).append(">");
        System.out.println(sb.toString());
    }
}
