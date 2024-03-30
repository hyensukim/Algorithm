import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String N = st.nextToken();

		int B = Integer.parseInt(st.nextToken());

		int sum = 0, tmp = 1;

		for(int i=N.length()-1; i >= 0; i--){
			char ch = N.charAt(i);

			if('A'<=ch && 'Z' >= ch){
				sum += (ch-55) * tmp;
			}else{
				sum += (ch-48) * tmp;
			}
			tmp *= B;
		}
		System.out.println(sum);
		br.close();
	}
}