import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArr = br.readLine().split(" ");

        int a1 = Integer.parseInt(sArr[0]);
        int a0 = Integer.parseInt(sArr[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        if (a1 <= c && 0 <= (c - a1) * n0 - a0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();
        bw.flush();
        bw.close();
    }
}