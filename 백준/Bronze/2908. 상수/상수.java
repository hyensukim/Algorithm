import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split(" ");

        br.close();

        String result = "";

        boolean isN1 = false;
        for (int i = 2; i >= 0; i--) {
            char n1 = sArr[0].charAt(i);
            char n2 = sArr[1].charAt(i);

            if (n1 > n2) {
                isN1 = true;
                break;
            } else if (n1 < n2) {
                break;
            }
        }

        StringBuilder sb;
        if (isN1) {
            sb = new StringBuilder(sArr[0]);
            result = sb.reverse().toString();
        } else {
            sb = new StringBuilder(sArr[1]);
            result = sb.reverse().toString();
        }

        System.out.println(result);
    }
}