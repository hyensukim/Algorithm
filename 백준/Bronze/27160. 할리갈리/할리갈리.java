import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());

        String result = "NO";

        map.put("STRAWBERRY", 0);
        map.put("BANANA", 0);
        map.put("LIME", 0);
        map.put("PLUM", 0);

        StringTokenizer st;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());

            String fruit_name = st.nextToken();

            int count = map.get(fruit_name) + Integer.parseInt(st.nextToken());

            map.put(fruit_name, count);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value == 5) {
                result = "YES";
                break;
            }
        }

        br.close();

        System.out.println(result);
    }
}