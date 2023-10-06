import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            switch(st.nextToken()){
                case "push" :
                    dq.offer(Integer.parseInt(st.nextToken())); break;
                case "pop" :
                    if(dq.size() != 0) sb.append(dq.pop()).append("\n");
                    else sb.append("-1").append("\n"); break;
                case "size" :
                    sb.append(dq.size()).append("\n"); break;
                case "empty" :
                    sb.append(dq.size() == 0 ? 1 : 0).append("\n"); break;
                case "front" :
                    if(dq.size() != 0) sb.append(dq.peekFirst()).append("\n");
                    else sb.append("-1").append("\n"); break;
                case  "back" :
                    if(dq.size() != 0) sb.append(dq.peekLast()).append("\n");
                    else sb.append("-1").append("\n"); break;
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}