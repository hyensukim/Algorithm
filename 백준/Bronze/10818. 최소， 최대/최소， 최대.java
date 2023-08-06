import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");


		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while(st.hasMoreTokens()){
			int value = Integer.parseInt(st.nextToken());
			max = max < value ? value : max;
			min = min > value ? value : min;
		}

		System.out.print(min + " "+ max);
	}
}