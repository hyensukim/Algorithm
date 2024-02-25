import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int[] a = new int[20000001];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            a[10000000 + k]++;
        }
        
        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        br.close();
        
        for(int i=0; i<m; i++){
            int target = Integer.parseInt(st.nextToken());
            
            sb.append(a[target + 10000000]).append(" ");
        }
        
        sb.deleteCharAt(sb.length() - 1);
        
        System.out.println(sb);
    }
}