import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        int[] now;
        
        StringBuilder sb = new StringBuilder();
        
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            
            now = new int[n];
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for(int i=0; i < n; i++){
                now[i] = Integer.parseInt(st.nextToken());
            }
            
            long sum = 0;
            
            long max = 0;
            
            for(int i = now.length -1; i >= 0; i--){
                if(now[i] > max){
                    max = now[i];
                }else{
                    sum += (max - now[i]);
                }
            }
            
            sb.append(sum).append("\n");
        }
        
        br.close();
        
        System.out.println(sb);
    }
}