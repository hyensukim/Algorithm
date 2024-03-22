import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int[][] box; // 박스
    static int count = 0; // 최소 날짜
    static int m, n; // 가로, 세로
    static Queue<int[]> q = new LinkedList<>(); // 익은 토마토 인덱스

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = br.readLine().split(" ");
        m = Integer.parseInt(sArr[0]);
        n = Integer.parseInt(sArr[1]);
        box = new int[n][m];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1)
                    q.offer(new int[] { i, j });
            }
        }

        br.close();

        System.out.println(bfs());
    }

    static int bfs() {

        while (!q.isEmpty()) {
            int[] idx = q.poll();
            int c = idx[0];
            int r = idx[1];

            for (int i = 0; i < 4; i++) {
                int col = c + dx[i];
                int row = r + dy[i];

                if (row >= 0 && col >= 0 && col < n && row < m) {
                    if (box[col][row] == 0) {
                        q.offer(new int[] { col, row });
                        box[col][row] = box[c][r] + 1;
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (box[i][j] == 0)
                    return -1;

                count = Math.max(count, box[i][j]);
            }
        }

        if (count == 1) {
            return 0;
        } else {
            return count - 1;
        }
    }
}