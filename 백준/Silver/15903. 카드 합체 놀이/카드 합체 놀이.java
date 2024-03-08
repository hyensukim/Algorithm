import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> q = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());

        br.close();

        for (int i = 0; i < n; i++) {
            q.offer(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            long tmp = q.poll() + q.poll();
            q.offer(tmp);
            q.offer(tmp);
        }
        
        long sum = 0;

        while(!q.isEmpty()){
            sum += q.poll();
        }

        System.out.println(sum);
    }
}