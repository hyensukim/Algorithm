import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N];
        
        for(int i=0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int[] arr1 = new int[2];
            int[] arr2 = new int[5];
            for(int j=0; j < 2; j++){
                arr1[j] = Integer.parseInt(st.nextToken());
            }
            
            for(int j=0; j < 5; j++){
                arr2[j] = Integer.parseInt(st.nextToken());
            }
            
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            
            scores[i] = arr1[1] + arr2[3] + arr2[4];
        }
        int max = Arrays.stream(scores).max().getAsInt();
        System.out.println(max);
        br.close();
    }
}