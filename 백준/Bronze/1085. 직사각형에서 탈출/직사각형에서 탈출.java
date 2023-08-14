import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		int shortest = Integer.MAX_VALUE;

		shortest = (w-x) < (h-y) ? w-x : h-y;

		shortest = shortest < x ? shortest : x;
        
        shortest = shortest < y ? shortest : y;

		System.out.println(shortest);
		br.close();
	
	}
}