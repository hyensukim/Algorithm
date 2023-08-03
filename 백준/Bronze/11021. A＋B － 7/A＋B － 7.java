import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());

        for(int i = 1; i <= T; i++){
            String nums = br.readLine();
            String[] arr = nums.split(" ");
            int result = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
            sb.append("Case #" + i + ": " + result + "\n");
        }

        br.close();
        System.out.println(sb);
	}
}