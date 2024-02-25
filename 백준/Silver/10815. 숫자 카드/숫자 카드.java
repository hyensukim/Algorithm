import java.io.*;
import java.util.*;

public class Main{
    static int n;
    static int[] a;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
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
        
        for(int i=0; i < m; i++){
            int target = Integer.parseInt(st.nextToken());
            
            if(binarySearch(target)){
                sb.append(1).append(" ");
            }else{
                sb.append(0).append(" ");
            }
        }
        
        sb.deleteCharAt(sb.length() - 1);
        
        System.out.println(sb);
    }
    
    static boolean binarySearch(int target){
        int start = 0;
        int end = n - 1;
        
        if(target < a[start] || target > a[end]){
            return false;
        }
        
        while(start <= end){
            int middle = (start + end) / 2;
            
            if(target < a[middle]){
                end = middle - 1;
            }
            else if(target > a[middle]){
                start = middle + 1;
            }
            else{
                return true;
            }
        }
        
        return false;
    }
}