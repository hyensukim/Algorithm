import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 커서 기준 L,R
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();
        String str = br.readLine();
        
        /* 처음 입력값 stack-L에 담기 */
        for(char ch : str.toCharArray()){
            stackL.push(ch);
        }
        
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();
            if(command.equals("L")){
                if(stackL.empty()) continue;
                char ch = stackL.pop();
                stackR.push(ch);
            }
            else if(command.equals("D")){
                if(stackR.empty()) continue;
                char ch = stackR.pop();
                stackL.push(ch);
            }
            else if(!stackL.empty() && command.equals("B")){
                stackL.pop();
            }
            else if(command.equals("P")){
                char ch = st.nextToken().charAt(0);
                stackL.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stackL.empty()){
            char ch = stackL.pop();
            sb.append(ch);
        }

        sb.reverse();

        while(!stackR.empty()){
            char ch = stackR.pop();
            sb.append(ch);
        } 

        System.out.println(sb);
        br.close();
    }
}