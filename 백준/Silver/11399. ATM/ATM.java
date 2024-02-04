import java.io.*;
import java.util.*;

public class Main{
    static int[] arr;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 입력 초기화
        arr = new int[N]; // 시간들
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 삽입 정렬
        int value = 0;
        for(int i=1; i < N; i++){
            for(int j=0; j < i; j++){
                if(arr[i] < arr[j]){
                    value = arr[i];
                    shift(j,i);
                    arr[j] = value;
                }
            }
        }

        // 시간누적합 구하기
        int sum = 0; // 시간의 합 (pi)
        for(int i=1; i <= N; i++){
            for(int j=0; j < i; j++){
                sum += arr[j];
            }
        }
        
        // 출력
        br.close();
        System.out.println(sum);
    }
    
    static void shift(int start, int end){
        for(int i= end-1; i >= start; i--){
            arr[i+1] = arr[i];
        }
    }
}