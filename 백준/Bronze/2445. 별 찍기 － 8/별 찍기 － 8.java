import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        StringBuilder tmp_sb;

        int n = Integer.parseInt(br.readLine());

        br.close();

        for (int i = 1; i <= n - 1; i++) {

            tmp_sb = new StringBuilder();

            for (int j = 0; j < i; j++) {
                tmp_sb.append("*");
            }

            for (int j = n - i; j > 0; j--) {
                tmp_sb.append(" ");
            }

            sb.append(tmp_sb).append(tmp_sb.reverse()).append("\n");
        }

        for (int i = 0; i < n * 2; i++) {
            sb.append("*");
        }

        sb.append("\n");

        for (int i = 1; i <= n - 1; i++) {

            tmp_sb = new StringBuilder();

            for (int j = n - i; j > 0; j--) {
                tmp_sb.append("*");
            }

            for (int j = 0; j < i; j++) {
                tmp_sb.append(" ");
            }

            sb.append(tmp_sb).append(tmp_sb.reverse()).append("\n");
        }

        System.out.println(sb);
    }
}