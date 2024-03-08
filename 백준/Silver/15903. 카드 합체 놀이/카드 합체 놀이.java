import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(st.nextToken());

        long[] a = new long[n];

        st = new StringTokenizer(br.readLine());

        br.close();

        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < m; i++) {
            Arrays.sort(a);

            long tmp = a[0] + a[1];

            a[0] = tmp;

            a[1] = tmp;
        }
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println(sum);
    }
}