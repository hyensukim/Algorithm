import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        Stack<Character> stack = new Stack<>();
        
        StringBuilder sb = new StringBuilder();

        boolean isSpecial = false;

        int idx = 0;

        for(char ch : S.toCharArray()){
            if(ch == '<') {
                isSpecial = true;
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
            }
            else if(ch == '>'){
                sb.append(">");
                isSpecial = false;
                idx++;
                continue;
            }

            if(isSpecial){
                sb.append(ch);
            }
            else if(ch == ' '){
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }else{
                stack.push(ch);
            }
            
            if(idx == S.length()-1){
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
            }

            idx++;
        }
        System.out.println(sb);
        br.close();
    }
}