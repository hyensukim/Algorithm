import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		String str = "";

		while(!(str = br.readLine()).equals("-1")){

			int n = Integer.parseInt(str);

			int[] arr = new int[n+1];

			int sum = 0;

			for(int i = 1; i <= n; i++){	
				if(n%i == 0 && n != i){
					arr[i] = i;
					sum += i;
				}
			}

			if( sum != n){
				sb.append(n + " is NOT perfect.").append("\n");
				continue;
			}

			sb.append(n + " = 1");

			for(int i = 1; i < arr.length; i++){
				if( arr[i] > 1){
					sb.append(" + " + arr[i]);
				}
			}
				
			sb.append("\n");
		}

		System.out.println(sb);
		br.close();
	}
}