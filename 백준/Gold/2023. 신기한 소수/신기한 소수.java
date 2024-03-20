import java.io.*;
import java.util.*;

public class Main{
    static int N;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();
        
        dfs(2,1);
        dfs(3,1);
        dfs(5,1);
        dfs(7,1);
    }
    
    static void dfs(int n, int digit){
        if(N == digit){
            if(isPrime(n)){
                System.out.println(n);
            }
            return;
        }
        
        for(int i=1; i<10; i+=2){
            if(isPrime(n*10+i)){
                dfs(n*10+i,digit+1);
            }
        }
    }
    
    static boolean isPrime(int n){
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}