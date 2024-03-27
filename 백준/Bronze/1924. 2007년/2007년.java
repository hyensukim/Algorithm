import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 0 - 1월
        String[] dayOfWeek = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

        String[] sArr = br.readLine().split(" ");
        br.close();

        int month = Integer.parseInt(sArr[0]);
        int date = Integer.parseInt(sArr[1]);

        int tmp = 0;

        for (int i = 0; i < month - 1; i++) {
            tmp += days[i];
        }

        String result = dayOfWeek[(tmp + date) % 7];

        System.out.println(result);
    }
}