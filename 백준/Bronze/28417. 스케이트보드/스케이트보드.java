import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        int[] arr = new int[5];
        
        for(int i=0; i < N; i++){
            int t = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            t += Math.max(a,b);
            
            for(int j=0; j < 5; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr);
            
            t += (arr[4] + arr[3]);
            scores[i] = t;
        }
        int max = Arrays.stream(scores).max().getAsInt();
        System.out.println(max);
        br.close();
    }
}