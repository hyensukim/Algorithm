import java.io.*;

public class Main {
    static int n, m;
    static boolean[] visited;
    static int[] arr;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");

        sb = new StringBuilder();

        n = Integer.parseInt(sArr[0]);

        m = Integer.parseInt(sArr[1]);

        visited = new boolean[n + 1];

        arr = new int[m];

        dfs(0);

        br.close();

        System.out.println(sb);
    }

    static void dfs(int depth) {
        if (depth == m) {
            for (int a : arr) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                for (int j = 1; j <= i; j++) {
                    visited[j] = true;
                }
                arr[depth] = i;
                dfs(depth + 1);
                for (int j = 1; j <= i; j++) {
                    visited[j] = false;
                }
            }
        }
    }
}