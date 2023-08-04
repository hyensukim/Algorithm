import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int len = arr.length;
        //배열 담기
        for(int i=0; i < len; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        //정렬
        for(int i=0; i < len-1; i++){
            for(int j=0; j < len-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        //평균
        int avg = 0;
        int sum = 0;
        int mid = 0;

        for(int i = 0; i < len; i++){
            sum += arr[i];
        }
        
        //출력
        avg = sum/5;
        mid = arr[2];
        System.out.println(avg);
        System.out.println(mid);
        br.close();
    }
}