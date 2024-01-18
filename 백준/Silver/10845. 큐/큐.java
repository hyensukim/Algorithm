import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        LinkedList<String> queue = new LinkedList<>();
        
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                String str = st.nextToken();
                
                switch(str){
                    case "push":
                        queue.add(st.nextToken());
                        break;
                    case "pop":
                        if(!queue.isEmpty()){
                            sb.append(queue.poll());
                        }else{
                            sb.append(-1);
                        }
                        break;
                    case "size":
                        sb.append(queue.size());
                        break;
                    case "empty":
                        if(queue.isEmpty()){
                            sb.append(1);
                        }else{
                            sb.append(0);
                        }
                        break;
                    case "front":
                        if(!queue.isEmpty()){
                            sb.append(queue.peekFirst());
                        }else{
                            sb.append(-1);
                        }
                        break;
                    case "back":
                        if(!queue.isEmpty()){
                            sb.append(queue.peekLast());
                        }else{
                            sb.append(-1);
                        }
                        break;
                }
                if(!str.equals("push")){
                    sb.append("\n");
                }
            }
        }
        br.close();
        System.out.println(sb);
    }
}