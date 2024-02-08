import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 입력 개수

        // 입력값 범위(0~10000)에 해당하는 배열 생성
        int[] arr = new int[10001];

        // 입력 받은 수를 배열의 인덱스로 카운팅
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
        }

        // 배열의 인덱스를 순회하며 카운팅된 수만큼 출력
        for (int i = 0; i < 10001; i++) {
            while (arr[i] > 0) {
                bw.write(Integer.toString(i) + "\n");
                arr[i]--;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
