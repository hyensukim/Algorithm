import java.util.*;
import java.io.*;

public class Main{
    static int[] arr, tmp;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        // 배열에 입력
        arr = new int[N+1];
        tmp = new int[N+1];
        for(int i=1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(1,N);
        for(int i =1; i<=N;i++){
            sb.append(arr[i]).append("\n");
        }
        
        br.close();
        System. out.println(sb);
    }
    
    static void mergeSort(int s, int e){
        if(e-s < 1) 
            return;
        int m = s + (e-s)/2;
        mergeSort(s,m);
        mergeSort(m+1,e);
        
        for(int i=s; i <= e; i++){
            tmp[i] = arr[i];
        }
        
        int k = s;
        int idx1 = s;
        int idx2 = m+1;
        while(idx1 <= m && idx2 <= e){
         
            if(tmp[idx1] > tmp[idx2]){
                arr[k] = tmp[idx2];
                k++;
                idx2++;
            }else{
                arr[k] = tmp[idx1];
                k++;
                idx1++;
            }
        }
        while(idx1 <= m){
            arr[k] = tmp[idx1];
            k++;
            idx1++;
        }
        
        while(idx2 <= e){
            arr[k] = tmp[idx2];
            k++;
            idx2++;
        }
    }
}