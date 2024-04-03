import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        StringTokenizer st;
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 항목 갯수
            int m = Integer.parseInt(st.nextToken()); // 찾을 항목 현재 위치
            st = new StringTokenizer(br.readLine());

            if (n < 2) {
                sb.append(1).append("\n");
                continue;
            }

            for (int i = 0; i < n; i++) {
                q.offer(Integer.parseInt(st.nextToken()));
            }

            int out_count = 0, now_index = m;

            while (now_index >= 0) {
                int factor = q.peek();

                if (factor < Collections.max(q)) {
                    q.offer(q.poll());
                    if (now_index == 0)
                        now_index = q.size();
                } else {
                    out_count++;
                    q.poll();
                }

                now_index--;
            }

            q.clear();

            sb.append(out_count).append("\n");
        }

        br.close();

        System.out.println(sb);
    }
}