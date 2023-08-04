import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine()," ");
        //배열 담기
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //배열 정렬
        for(int i=0; i < N-1; i++){
            for(int j=0; j < N-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println(arr[N-k]);
        br.close();
    }
}