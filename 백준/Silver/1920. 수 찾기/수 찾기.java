import java.io.*;
import java.util.*;

public class Main{
    static StringBuilder sb = new StringBuilder();
    static int[] a;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        a = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(a);
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        br.close();
        
        for(int i=0; i<m; i++){
            int k = Integer.parseInt(st.nextToken());
            halfSearch(k,0,n-1);
        }
        
        System.out.println(sb);
    }
    
    static void halfSearch(int find, int start, int end){
        
        if(start <= end){
            
            int half = (start + end)/2;
            
            if(a[half] > find){
                halfSearch(find,start, half-1);
            }
            else if(a[half] < find){
                halfSearch(find,half+1, end);
            }
            else{
                sb.append(1).append("\n");
                return;
            }
            
        }
        else{
            
            sb.append(0).append("\n");
            return;
            
        }
    }
}