import java.util.*;
import java.io.*;

public class Main {
    static int m, n;
    static boolean[][] visited;
    static boolean[][] area;
    static int[] dr = { -1, 1, 0, 0 };
    static int[] dc = { 0, 0, -1, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken()); // 가로
            n = Integer.parseInt(st.nextToken()); // 세로
            area = new boolean[n][m];
            visited = new boolean[n][m];

            int k = Integer.parseInt(st.nextToken()); // 배추 갯수

            int count = 0;
            for (int i = 0; i < k; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                area[y][x] = true;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && area[i][j]) {
                        count++;
                        dfs(i, j);
                    }
                }
            }
            sb.append(count).append("\n");
        }

        br.close();

        System.out.println(sb);
    }

    static void dfs(int c, int r) {
        visited[c][r] = true;
        for (int i = 0; i < 4; i++) {
            int row = dr[i] + r;
            int col = dc[i] + c;

            if (row < 0 || col < 0 || row >= m || col >= n)
                continue;

            if (!visited[col][row] && area[col][row]) {
                dfs(col, row);
            }
        }
    }
}