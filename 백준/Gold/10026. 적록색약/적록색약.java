import java.io.*;

public class Main {
    static int[] dr = { -1, 1, 0, 0 };
    static int[] dc = { 0, 0, -1, 1 };
    static int n;
    static String[][] area;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        area = new String[n][n];

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            area[i] = br.readLine().split("");
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }

        int ancnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = false;
                if (area[i][j].equals("G"))
                    area[i][j] = "R";
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    dfs(i, j);
                    ancnt++;
                }
            }
        }

        br.close();

        System.out.println(cnt + " " + ancnt);
    }

    static void dfs(int c, int r) {
        visited[c][r] = true;
        String color = area[c][r];

        for (int i = 0; i < 4; i++) {
            int col = c + dc[i];
            int row = r + dr[i];

            if (col < 0 || row < 0 || col >= n || row >= n)
                continue;

            if (!visited[col][row] && area[col][row].equals(color)) {
                dfs(col, row);
            }
        }
    }
}