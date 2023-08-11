import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		long dot = 1;

		for(int i=0; i < N; i++){
			dot *= 2;
		}

		++dot;
		dot *= dot;
		System.out.println(dot);
		br.close();
	}
}