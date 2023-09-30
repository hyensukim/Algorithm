import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i < N; i++){
            String str = br.readLine();
            if(str.contains("push")){
                String tmp = str.substring(5);
                int X = Integer.parseInt(tmp);
                stack.push(X);
            }else if(str.equals("pop")){
                if(!stack.empty()){
                    Integer num = stack.pop();
                    sb.append(num).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }else if(str.equals("size")){
                sb.append(stack.size()).append("\n");
            }else if(str.equals("empty")){
                int tmp = 0;
                tmp = stack.empty() ? 1 : 0;
                sb.append(tmp).append("\n");
            }else{ // top
                if(!stack.empty()){
                    Integer num = stack.peek();
                    sb.append(num).append("\n");
                }else{
                    sb.append("-1").append("\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}