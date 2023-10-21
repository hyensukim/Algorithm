import java.io.*;
import java.util.*;

public class Main{
     public static void main(String[] args)throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         boolean[] isPrime = new boolean[1000001];
         isPrime[0] = isPrime[1] = true;
         
         for(int i = 2 ; i < (int)Math.sqrt(isPrime.length); i++){
             if(isPrime[i]) continue;
             for(int j = i * 2; j < isPrime.length; j+=i){
                 isPrime[j] = true;
             }
         }
         
         int n = 0;
         boolean isProve = false;
         while((n = Integer.parseInt(br.readLine())) != 0){
             for(int i = 2; i <= (n/2); i++){
                 if(!isPrime[i] && !isPrime[n-i]){
                     System.out.println(n +" = " + i + " + " + (n-i));
                     isProve = true;
                     break;
                 }
             }
         }
         br.close();
         if(!isProve) System.out.println("Goldbach's conjecture is wrong.");
     }   
}