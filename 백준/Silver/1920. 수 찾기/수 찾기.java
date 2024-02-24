import java.io.*;
import java.util.*;

public class Main{
    static int[] a;
    static int n;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        a = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(a);
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        br.close();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<m; i++){
            int target = Integer.parseInt(st.nextToken());
            
            if(halfSearch(target)){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
            
        }
        
        System.out.println(sb);
    }
    
    static boolean halfSearch(int target){
        int start = 0;
        int end = n-1;

        while(start <= end){

            int half = (start + end) / 2;

            if(a[half] > target){
                end = half-1;
            }
            else if(a[half] < target){
                start = half+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}