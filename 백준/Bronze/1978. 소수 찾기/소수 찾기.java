import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int cnt = 0;

		for(int i=0; i < n; i++){
			int x = Integer.parseInt(st.nextToken());

			int divisorCnt = 0;

			for(int j=1; j <= x;j++){
				if(x%j == 0){
					divisorCnt++;
				}
			}

			if(divisorCnt == 2){
				cnt++;
			}
		}
		
		System.out.println(cnt);

		br.close();
	}
}