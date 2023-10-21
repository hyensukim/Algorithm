import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int M = Integer.parseInt(arr[0]);
        int N = Integer.parseInt(arr[1]);
        br.close();
        
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i <= Math.sqrt(N); i++){
            if(!isPrime[i]) continue;
            
            for(int j = i *2; j <= N; j += i){
                isPrime[j] = false;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = M; i <= N; i++){
            if(isPrime[i]){
                sb.append(i).append("\n");
            }
        }
        
        System.out.println(sb);
    }
}