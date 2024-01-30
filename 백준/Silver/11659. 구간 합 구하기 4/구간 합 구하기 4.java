import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int[] arr;
    static Integer[] sum;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        sum = new Integer[N+1];
        sum[0] = arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            solve(i);
        }

        for(int k=0; k < M; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if(i == 1){
                sb.append(solve(j)).append("\n");
            }else if(i == j){
                sb.append(arr[j]).append("\n");
            }else{
                sb.append(arr[i] + (sum[j]-sum[i])).append("\n");
            }
        }
        
        br.close();
        System.out.println(sb);
    }
    
    static int solve(int i){
        if(sum[i] == null){
            sum[i] = sum[i-1] + arr[i];
        }
        return sum[i];
    }
}
