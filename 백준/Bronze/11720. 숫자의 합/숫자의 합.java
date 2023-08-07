import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		String str = br.readLine();
		int sum = 0;
		for(int i=0; i<str.length(); i++){
			int n =Integer.parseInt(str.substring(i,i+1));
			if(n > 0) sum += n;
		}
		br.close();
		System.out.println(sum);
	}
}