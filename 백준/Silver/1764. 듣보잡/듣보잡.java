import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result = new StringBuilder();

        String[] sArr = br.readLine().split(" ");

        int n = Integer.parseInt(sArr[0]);

        int m = Integer.parseInt(sArr[0]);

        Map<String, Integer> not_listen = new HashMap<>();

        ArrayList<String> not_listen_look = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            not_listen.put(br.readLine(), 1);
        }
        for (int i = 0; i < m; i++) {
            String not_look = br.readLine();

            if (not_listen.containsKey(not_look)) {
                not_listen_look.add(not_look);
            }
        }

        Collections.sort(not_listen_look);

        result.append(not_listen_look.size()).append("\n");

        for (String s : not_listen_look) {
            result.append(s).append("\n");
        }

        br.close();

        System.out.println(result);
    }
}
