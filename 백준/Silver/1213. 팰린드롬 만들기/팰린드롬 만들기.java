import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int[] arr = new int[26];
        
        for (char n : s.toCharArray()) {
            int index = n - 65;
            arr[index]++;
        }

        int odd_count = 0; // 홀수 갯수 1개 - 중간값, 2개 이상 - 팰린드롬 X
        for (int n : arr) {
            if (n % 2 == 1)
                odd_count++;
        }

        if (odd_count > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        } else { // 팰린드롬 문자 담기
            
            // 앞
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i] / 2; j++) {
                    sb.append((char) (i + 65));
                }
            }
            
            String reverse = new StringBuilder(sb).reverse().toString();
            
            // 중간(있으면)
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1)
                    sb.append((char) (i + 65));
            }
            
            // 뒤
            sb.append(reverse);
        }
        
        br.close();

        System.out.println(sb);
    }
}