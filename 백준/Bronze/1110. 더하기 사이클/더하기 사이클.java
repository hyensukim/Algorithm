import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        int result = 0;
        while(true){
            result++;
            int share = num / 10;
            int remain = num % 10;
            int subRemain = (share + remain) % 10;
            num = remain * 10 + (subRemain);
            if(N == num) {
                break;
            }
        }

        System.out.println(result);
    }
}