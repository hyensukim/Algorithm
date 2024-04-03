import java.util.*;
import java.io.*;

// 60분 초과
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<int[]> deq = new ArrayDeque<>(); // 0 : 위치값, 1: 이동횟수

        int n = Integer.parseInt(br.readLine()); // 풍선 갯수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(st.nextToken());
            deq.offer(new int[] { i + 1, number });
        }

        sb.append("1 ");
        int moveValue = deq.pollFirst()[1];
        while (!deq.isEmpty()) {
            if (moveValue > 0) {
                for (int i = 1; i < moveValue; i++) {
                    deq.offerLast(deq.pollFirst());
                }
                int[] balloon = deq.pollFirst();
                moveValue = balloon[1];
                sb.append(balloon[0]).append(" ");
            } else {
                for (int i = 1; i < -moveValue; i++) {
                    deq.offerFirst(deq.pollLast());
                }
                int[] balloon = deq.pollLast();
                moveValue = balloon[1];
                sb.append(balloon[0]).append(" ");
            }
        }

        br.close();

        System.out.println(sb);
    }
}