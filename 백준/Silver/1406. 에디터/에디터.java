import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String initial = br.readLine();
        int N = initial.length();
        int M = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();        
        Stack<Character> prevStack = new Stack<>();
        Stack<Character> nextStack = new Stack<>();
        
        for(int i = 0; i < N; i++){
            prevStack.push(initial.charAt(i));
        }
        
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            char ch = str.charAt(0);

            switch(String.valueOf(ch)){
                case "L" : 
                    if(prevStack.empty()){ break; }
                    nextStack.push(prevStack.pop());
                    break;
                case "D" :
                    if(nextStack.empty()){ break; }
                    prevStack.push(nextStack.pop());
                    break;
                case "B" :
                    if(prevStack.empty()){ break; }
                    prevStack.pop();
                    break;
                case "P" :
                    prevStack.push(str.charAt(2));
                    break;
            }
        }

		while(!prevStack.empty()){
			sb.append(prevStack.pop());
		}

        sb.reverse();

		while(!nextStack.empty()){
			sb.append(nextStack.pop());
		}

        br.close();
        System.out.println(sb);
    }
}