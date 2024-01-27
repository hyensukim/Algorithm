import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    
    static int count;
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        count = 0;
        while(N-- > 0){
            String str = br.readLine();
            goodWordCheck(str);
        }
        br.close();
        System.out.println(count);
    }
    
    static void goodWordCheck(String str){
        if(str.length() % 2 == 1) return;
        
        Stack<Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        for(int i=1; i < str.length(); i++){
            if(!stack.empty() && stack.peek() == str.charAt(i)){
                stack.pop();
            }else{
                stack.push(str.charAt(i));
            }
        }
        
        if(stack.empty()) count++;
    }
}