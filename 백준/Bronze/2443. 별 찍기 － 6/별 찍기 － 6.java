import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        for(int i=N; i>0; i--){
            StringBuilder sb2 = new StringBuilder();
            
            for(int j=0; j<N-i; j++){
                sb2.append(" ");
            }
            
            for(int j=0; j<i-1; j++){
                sb2.append("*");
            }
            
            sb.append(sb2.toString()).append("*").append(sb2.reverse().toString().trim());
            sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}