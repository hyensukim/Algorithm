import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int pieces = 0;
        
        char[] chars = br.readLine().toCharArray();
        br.close();
        
        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];
            if(ch == '('){
                stack.push(ch);
                continue;
            }
            
            if(ch ==')'){
                stack.pop();
                
                if(chars[i-1] == ')'){
                    pieces++;
                }else{
                    pieces += stack.size();
                }
            }
        }
        System.out.println(pieces);
    }
}