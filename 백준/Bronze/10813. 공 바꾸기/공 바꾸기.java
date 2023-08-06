import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];

		for(int i = 1; i <= arr.length; i++){
			arr[i-1] = i;
		}
		
		for(int k=0; k < M; k++){
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			int num = arr[i];
			arr[i] = arr[j];
			arr[j] = num;
		}
		br.close();

		for(int i=0; i < arr.length; i++) sb.append(arr[i]).append(" ");
		System.out.println(sb);
	}
}