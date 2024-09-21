import java.io.*;
import java.util.*;

// 60분 초과
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Tower> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());

            while (!stack.empty() && stack.peek().height < now) {
                stack.pop();
            }

            if (stack.empty()) {
                sb.append(0).append(" ");
            } else {
                sb.append(stack.peek().index).append(" ");
            }

            stack.push(new Tower(i + 1, now));
        }

        br.close();

        System.out.println(sb);
    }
}

class Tower {
    public int index;
    public int height;

    public Tower(int index, int height) {
        this.index = index;
        this.height = height;
    }
}