import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        LinkedList<Integer> li = new LinkedList<>();
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str){
                case "push" :
                    li.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if(li.isEmpty()) sb.append(-1);
                    else sb.append(li.poll());
                    break;
                case "size":
                    sb.append(li.size());
                    break;
                case "empty" :
                    if(li.isEmpty()) sb.append(1);
                    else sb.append(0);
                    break;
                case "front" :
                    if(li.isEmpty()) sb.append(-1);
                    else sb.append(li.peekFirst());
                    break;
                case "back":
                    if(li.isEmpty()) sb.append(-1);
                    else sb.append(li.peekLast());
                    break;
            }
            
            if(!str.equals("push")){
                sb.append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}