import java.util.*;
import java.io.*;

public class Main {
    static int[] status;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine()); // 스위치 갯수
        status = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++)
            status[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine()); // 학생 수
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x == 1) {
                for (int i = 1; i < status.length; i++) {
                    if (i % y == 0) {
                        turnSwitch(i);
                    }
                }
            } else {
                if (y < 3 || y == n) {
                    turnSwitch(y);
                } else {
                    turnSwitch(y);

                    int index = 0;
                    while (true) {
                        int front = y - index;
                        int back = y + index;
                        if (front < 1 || back > n) {
                            break;
                        }

                        if (status[front] == status[back]) {
                            turnSwitch(front);
                            turnSwitch(back);
                        } else {
                            break;
                        }

                        index++;
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(status[i]).append(" ");
            if (i % 20 == 0) {
                sb.deleteCharAt(sb.length() - 1);
                sb.append("\n");
            }
        }

        br.close();

        System.out.println(sb);
    }

    static void turnSwitch(int idx) {
        if (status[idx] == 0) {
            status[idx] = 1;
        } else {
            status[idx] = 0;
        }
    }
}