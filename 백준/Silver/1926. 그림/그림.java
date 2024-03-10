import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = { 1, 0, -1, 0 };
    static int[] dy = { 0, 1, 0, -1 };
    static boolean[][] visited;
    static int[][] paper;
    static int n, m;
    static int depth;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");

        n = Integer.parseInt(s[0]); // 열

        m = Integer.parseInt(s[1]); // 행

        visited = new boolean[n][m]; // 방문 배열

        paper = new int[n][m]; // 도화지

        ArrayList<Integer> draws = new ArrayList<>();

        boolean isZero = true;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());

                if (isZero && paper[i][j] == 1) {
                    isZero = false;
                }
            }
        }

        if (isZero) {
            System.out.println(0);
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                depth = 0;
                if (paper[i][j] != 0 && !visited[i][j]) {
                    dfs(i, j);
                    draws.add(depth);
                }
            }
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        sb.append(draws.size()).append("\n");

        int max = 0;

        for (int i = 0; i < draws.size(); i++) {
            if (max < draws.get(i))
                max = draws.get(i);
        }

        sb.append(max).append("\n");

        System.out.println(sb);
    }

    static void dfs(int col, int row) {
        visited[col][row] = true;
        depth++;

        for (int i = 0; i < 4; i++) {
            int c = col + dy[i];
            int r = row + dx[i];

            if (c < 0 || c >= n || r < 0 || r >= m)
                continue;

            if (paper[c][r] != 0 && !visited[c][r])
                dfs(c, r);
        }
    }
}