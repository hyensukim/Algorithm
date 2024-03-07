import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());// 조카 수

        int n = Integer.parseInt(st.nextToken());// 과자 수

        int[] snack = new int[n];

        st = new StringTokenizer(br.readLine());

        br.close();

        for (int i = 0; i < n; i++) {
            snack[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(snack);

        long result = 0;

        long left = 1;

        long right = snack[n - 1];

        while (left <= right) {
            int count = 0;

            long mid = (left + right) / 2;

            for (int i = 0; i < n; i++) {
                count += snack[i] / mid;
            }

            if (count >= m) {
                if (result < mid)
                    result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}