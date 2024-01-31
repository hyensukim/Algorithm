import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int start_idx = 1, end_idx = 1, count = 1;
        
        long sum = 1;
        
        while(end_idx != N){
            if(sum < N){
                end_idx++;
                sum += end_idx;
            }
            
            else if(sum == N){
                end_idx++;
                sum += end_idx;
                count++;
            }
            
            else if(sum > N){
                sum -= start_idx;
                start_idx++;
            }
        }
        
        br.close();
        System.out.println(count);
    }
}