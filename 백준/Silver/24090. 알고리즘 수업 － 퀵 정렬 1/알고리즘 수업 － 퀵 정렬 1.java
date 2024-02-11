import java.io.*;
import java.util.*;

public class Main{
    static int count;
    static String result;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr= new int[N+1];
        
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        quickSort(arr, 1, N, K);
        
        if(count < K){
            System.out.println(-1);
        }else{
            System.out.println(result);
        }
    }
    
    static void quickSort(int[] arr, int S, int E, int K){
        if(S < E){
            int pivot = partition(arr,S,E,K);
            if(pivot < 0)
                return;
            quickSort(arr,S,pivot-1,K);
            quickSort(arr,pivot+1,E,K);
        }
    }
    
    static int partition(int[] arr, int S, int E, int K){
        int x = arr[E];
        int i = S-1;
        for(int j = S; j < E; j++){
            if(arr[j] <= x){
                swap(arr,++i,j);
                count++;
                
                if(count == K){
                    result = arr[i] + " " + arr[j];
                    return -1;
                }
            }
        }
        
        if(i+1 != E){
            swap(arr,i+1,E);
            count++;
        }
        
        if(count == K){
            result = arr[i+1] + " " + arr[E];
            return -1;
        }
        
        return i+1;
    }

    static void swap(int[] arr,int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}