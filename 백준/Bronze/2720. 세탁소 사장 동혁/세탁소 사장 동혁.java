import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = {25,10,5,1};

		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for(int i=0; i < T; i++){
			int C = Integer.parseInt(br.readLine());
			int tmp = 0;

			for(int j=0; j < 4; j++){
				tmp = C/arr[j];
				sb.append(tmp).append(" ");
				C = C % arr[j];
			}

			sb.append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}