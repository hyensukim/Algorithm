import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Queue;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        Queue<Integer> answer = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        for (int i=0; i<N; i++) {
            list.add(i+1);
        }
        int K = Integer.parseInt(st.nextToken());

        int idx = 0;
        while (!list.isEmpty()) {
            idx = (idx+K-1)%list.size();
            answer.add(list.remove(idx));
        }

        sb.append("<");
        while (!answer.isEmpty()) {
            sb.append(answer.poll());
            if (!answer.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}
