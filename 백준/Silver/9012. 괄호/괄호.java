import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        outer:for(int i=0; i < N; i++){
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            
            for(char ch : str.toCharArray()){
                if(ch == '('){
                    stack.push(ch);
                }
                
                else if(stack.empty()){
                    sb.append("NO").append("\n");
                    continue outer;
                }
                
                else{
                    stack.pop();
                }
            }
            
            if(stack.empty()){
                sb.append("YES").append("\n");
            }else{
                sb.append("NO").append("\n");
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}