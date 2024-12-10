import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();

        Deque<Character> stack = new ArrayDeque<>();
        int result = 0;
        int tmp = 1;

        OUT : for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            switch(ch){
                case '(' :
                    stack.push('(');
                    tmp *= 2;
                    break;
                case '[' :
                    stack.push('[');
                    tmp *= 3;
                    break;
                case ')' :
                    if(stack.isEmpty() || stack.peek() != '('){
                        result = 0;
                        break OUT;
                    }else{
                        if(str.charAt(i-1) == '(') result += tmp;
                        stack.pop();
                        tmp /= 2;
                    }
                    break;
                case ']' :
                    if(stack.isEmpty() || stack.peek() != '['){
                        result = 0;
                        break OUT;
                    }else{
                        if(str.charAt(i-1) == '[') result += tmp;
                        stack.pop();
                        tmp /= 3;
                    }
                    break;
            }
        }

        if(!stack.isEmpty()) System.out.println(0);
        else System.out.println(result);
    }
}
