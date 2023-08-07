import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		for(int i=0; i < 26; i++){
			char ch = (char)(i + 'a');
			int n = str.contains(ch+"") ? str.indexOf(ch) : -1;
			sb.append(n).append(" ");
		}

		System.out.println(sb);

		br.close();
	}
}