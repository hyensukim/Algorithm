import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr = Arrays.stream(arr).sorted().toArray();
        int count = 0, i = 0, j = N-1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum < M){
                i++;
            }
            else if(sum == M){
                i++;
                j--;
                count++;
            }
            else if(sum > M){
                j--;
            }
        }
        br.close();
        System.out.println(count);
    }
}