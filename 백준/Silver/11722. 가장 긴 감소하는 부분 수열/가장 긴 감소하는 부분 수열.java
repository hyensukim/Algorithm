import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n+1]; // 입력 배열
        int[] memo = new int[n+1]; // 메모이제이션

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 10 30 10 20 20 10
        int result = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            memo[i] = 1;
            for(int j=1; j<i; j++){
                if(arr[j] > arr[i]){
                    memo[i]=Math.max(memo[i],memo[j]+1);// 1 1 2 
                }
            }
            result = Math.max(result,memo[i]);
        }

        br.close();
        System.out.println(result);
    }
}
