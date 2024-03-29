import java.io.*;

public class Main {
    static int n, m;
    static boolean[] visited;
    static int[] arr;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArr = br.readLine().split(" ");

        n = Integer.parseInt(sArr[0]);

        m = Integer.parseInt(sArr[1]);

        visited = new boolean[n + 1];

        arr = new int[m];

        dfs(0);

        br.close();
        bw.flush();
        bw.close();
    }

    static void dfs(int depth) throws IOException {
        if (depth == m) {
            for (int a : arr) {
                bw.write(a + " ");
            }
            bw.write("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}