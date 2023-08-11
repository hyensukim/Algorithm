import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int n = 1;

		while((3*n*(n-1))+2 <= N){
			n++;
		}

		System.out.println(n);
		br.close();
	}
}