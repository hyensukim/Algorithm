import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int k = Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(st.nextToken());
        
        int[] a = new int[k];
        
        long max = 0;
        
        for(int i=0; i<k; i++){
            a[i] = Integer.parseInt(br.readLine());
            if(a[i] > max){
                max = a[i];
            }
        }
        
        max++;
        
        long min =0, mid = 0;
        
        while(min < max){
            mid = (min + max) / 2;
            
            long count = 0;
            
            for(int i=0; i < a.length; i++){
                count += (a[i]/mid);
            }
            
            if(count < n){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        
        br.close();
        
        System.out.println(min-1);
    }
}