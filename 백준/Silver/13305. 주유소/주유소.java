import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] dist = new long[n-1];
        long[] fare = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++){
            dist[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            fare[i] = Long.parseLong(st.nextToken());
        }

        long min = fare[0];
        long sum = 0;
        for(int i=0; i<n-1; i++){
            if(fare[i] < min){
                min = fare[i];
            }
            sum += (min * dist[i]);
            // if(dist[i] > remain){
            //     if(fare[i] > fare[i+1]){
            //         sum += (fare[i] * dist[i]);
            //         remain += dist[i];
            //     }
            //     else{
            //         if(i < n-2){
            //             sum += (fare[i] * dist[i] + fare[i] * dist[i+1]);
            //             remain += (dist[i] + dist[i+1]);
            //         }
            //         else{
            //             sum += (fare[i] * dist[i]);
            //             remain += dist[i];
            //         }
            //     }
            // }

            // remain -= dist[i];
        }

        br.close();

        System.out.println(sum);
    }
}
