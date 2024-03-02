import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] s = br.readLine().split(" ");
        
        br.close();
        
        long a = Long.parseLong(s[0]);
        
        long b = Long.parseLong(s[1]);
        
        boolean[] isPrime = new boolean[(int)Math.sqrt(b) + 1];
        
        Arrays.fill(isPrime, true);
        
        isPrime[0] = isPrime[1] = false;
        
        for(int i = 2; i < isPrime.length; i++){
            if(!isPrime[i])
                continue;
            
            for(int j = i * 2; j < isPrime.length; j += i){
                isPrime[j] = false;
            }
        }
        
        int count = 0;
        
        for(int i = 2; i < isPrime.length; i++){
            
            if(isPrime[i]){
                
                long tmp = i;
                
                while(tmp <= (double)b/i){
                    
                    if(tmp >=(double)a/i){
                        count++;
                    }
                    
                    tmp *= i;
                    
                }
            }
        }
        
        System.out.println(count);
    }
}