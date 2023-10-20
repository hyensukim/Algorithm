import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] range = br.readLine().split(" ");
        br.close();
        
        int M = Integer.parseInt(range[0]);
        int N = Integer.parseInt(range[1]);
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i < N; i++){
            if(!isPrime[i]) continue;
            
            for(int j = i * 2; j < isPrime.length; j += i){
                isPrime[j] = false;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i= M; i < isPrime.length; i++){
            if(isPrime[i]) sb.append(i).append("\n");
        }       
        System.out.println(sb);
    }
}