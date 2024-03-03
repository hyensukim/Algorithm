import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());

        long b = Long.parseLong(st.nextToken());

        if (a == 1 || b == 1 || Math.abs(a - b) == 1) {
            System.out.println(1);
            return;
        }

        long result = gcd(b, a);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result; i++) {
            sb.append("1");
        }

        br.close();

        System.out.println(sb);
    }

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}