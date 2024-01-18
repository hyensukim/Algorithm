import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long result = 0;
        
        while(K-- > 0){
            int n = Integer.parseInt(br.readLine());
            if(n == 0){
                stack.pop();
                continue;
            }
            stack.push(n);
        }
        br.close();
        while(!stack.empty()){
            Integer n = stack.pop();
            result += n;
        }
        
        System.out.println(result);
    }
}