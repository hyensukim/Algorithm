import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		Integer N = Integer.parseInt(st.nextToken());

		Integer K = Integer.parseInt(st.nextToken());

		int cnt = 0; // 약수의 갯수 카운팅

		int res = 0; // K번째 약수를 출력.

		for(int  i=1; i <= N; i++){
			
			if( N%i ==0) cnt++;

			if(cnt == K) {res = i; break;}
		}

		System.out.println(res);
		br.close();
	}
}