import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        br.close();
        
        int res = 0;
        char[] chars = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i < chars.length; i++){
            char ch = chars[i];
            if(ch == '('){
                stack.push(ch);
                continue;
            }
            
            if(ch == ')'){
                stack.pop();
                
                if(chars[i-1] == '('){
                    res += stack.size();
                }else{
                    res++;
                }
            }
        }
        
        System.out.println(res);
    }
}