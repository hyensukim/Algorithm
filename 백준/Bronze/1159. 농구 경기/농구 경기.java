import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        
        for(int i=0; i < N; i++){
            String str = br.readLine();
            char first = str.charAt(0);
            
            for(int j=0; j < 26; j++){
                if(first == 97+j){
                    arr[j]++;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            if(arr[i] >= 5){
                sb.append((char)(i+97));
            }
        }
        
        boolean isPREDAJA = Arrays.stream(arr).anyMatch(n->n>=5);
        
        if(isPREDAJA){
            System.out.println(sb);
        }else{
            System.out.println("PREDAJA");
        }

        br.close();
    }
}
