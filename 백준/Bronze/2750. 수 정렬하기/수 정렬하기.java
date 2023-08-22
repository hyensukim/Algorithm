import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < N-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        br.close();
    }
}