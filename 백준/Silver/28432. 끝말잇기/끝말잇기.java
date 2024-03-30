import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            list.add(str);
        }

        int q_mark_index = list.indexOf("?");

        int m = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(br.readLine());
            return;
        } else {
            char end_of_word = '0'; // 앞단어

            char start_of_word = '0'; // 뒷단어

            String tmp = "";

            if (q_mark_index == 0) {
                start_of_word = list.get(1).charAt(0);
            } else if (q_mark_index == n - 1) {
                tmp = list.get(q_mark_index - 1);
                end_of_word = tmp.charAt(tmp.length() - 1);
            } else {
                tmp = list.get(q_mark_index - 1);
                end_of_word = tmp.charAt(tmp.length() - 1);
                start_of_word = list.get(q_mark_index + 1).charAt(0);
            }

            for (int i = 0; i < m; i++) {
                tmp = br.readLine();

                if ((tmp.charAt(0) == end_of_word || end_of_word == '0') &&
                        (tmp.charAt(tmp.length() - 1) == start_of_word || start_of_word == '0') &&
                        !list.contains(tmp)) {
                    System.out.println(tmp);
                    return;
                }
            }
        }

        br.close();
    }
}