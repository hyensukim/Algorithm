import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        
        // 담기
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        
        // 출력 로직
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < N; i++){
            sb.append(arr[i]).append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}