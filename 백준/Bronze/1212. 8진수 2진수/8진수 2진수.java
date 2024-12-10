import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    static String[] base = {"000","001","010","011","100","101","110","111"};
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String S = in.readLine();
        
        // 입력이 "0"인 경우를 처리
        if (S.equals("0")) {
            System.out.println("0");
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        // 첫 번째 숫자는 선행 0을 제거하기 위해 특별히 처리
        int firstDigit = Integer.parseInt(String.valueOf(S.charAt(0)));
        String firstBinary = base[firstDigit];
        // 첫 번째 숫자의 불필요한 선행 0을 제거
        for (int i = 0; i < 3; i++) {
            if (firstBinary.charAt(i) == '1') {
                sb.append(firstBinary.substring(i));
                break;
            }
        }
        
        // 나머지 숫자들 처리
        for (int i = 1; i < S.length(); i++) {
            int idx = Integer.parseInt(String.valueOf(S.charAt(i)));
            sb.append(base[idx]);
        }
        
        System.out.println(sb.toString());
    }
}