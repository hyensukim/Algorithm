import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.StringTokenizer;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        Deque<Integer> queue = new ArrayDeque<>();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch(command) {
                case "push" :
                    int value = Integer.parseInt(st.nextToken());
                    queue.offer(value); break;
                case "pop" :
                    if(queue.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(queue.poll()).append("\n");
                    } break;
                case "size" :
                    sb.append(queue.size()).append("\n"); break;
                case "empty" :
                    if(queue.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    } break;
                case "front" :
                    if(!queue.isEmpty()) {
                        sb.append(queue.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    } break;
                default :
                    if(!queue.isEmpty()) {
                        sb.append(queue.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
            }
        }
        br.close();
        System.out.println(sb);
    }
}