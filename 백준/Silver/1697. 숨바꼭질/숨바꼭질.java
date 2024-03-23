import java.util.*;
import java.io.*;

public class Main {
    static int[] count;
    static int n, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");
        n = Integer.parseInt(sArr[0]);
        k = Integer.parseInt(sArr[1]);

        count = new int[100_001];

        bfs(n);

        br.close();
    }

    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        count[x] = 0;
        while (!q.isEmpty()) {
            int num = q.poll();

            //for (int i = 0; i <= k; i++) {
                //System.out.print(count[i]);
            //}
            //System.out.println();

            if (num == k) {
                System.out.println(count[num]);
                return;
            }

            if (num - 1 >= 0 && count[num - 1] == 0) {
                count[num - 1] = count[num] + 1;
                q.offer(num - 1);
            }

            if (num + 1 <= 100_000 && count[num + 1] == 0) {
                count[num + 1] = count[num] + 1;
                q.offer(num + 1);
            }

            if (num * 2 <= 100_000 && count[num * 2] == 0) {
                count[num * 2] = count[num] + 1;
                q.offer(num * 2);
            }
        }
    }
}