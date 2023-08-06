import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Integer[] arr = new Integer[N];

        // 대입
		for(int i=0; i < arr.length; i++) arr[i] = i+1;

		for(int k=0; k < M; k++){
			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken())-1;
			int j = Integer.parseInt(st.nextToken())-1;
			while(i < j){
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++; j--;
			}
		}
		br.close();
		for(int a : arr){
			sb.append(a).append(" ");
		}
		System.out.println(sb);	
	}
}