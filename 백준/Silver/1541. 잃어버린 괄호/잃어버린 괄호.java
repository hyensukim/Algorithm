import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        while (st.hasMoreTokens()) {
            int tmp = 0;

            String[] nums = st.nextToken().split("\\+");

            for (String num : nums) {
                tmp += Integer.parseInt(num);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = tmp;
            } else {
                sum -= tmp;
            }

        }

        br.close();

        System.out.println(sum);

    }
}