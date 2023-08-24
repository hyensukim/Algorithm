import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for(int i=1; i <= N; i++){
            sum += i;
        }
        sb.append(sum).append('\n');
        sb.append((int)Math.pow(sum,2)).append('\n');
        sum = 0;
        
        for(int i=1; i <= N; i++){
            sum += Math.pow(i,3);
        }
        sb.append(sum).append('\n');
        
        System.out.println(sb);
        br.close();
    }
}