import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		int cnt = 0;

		for(int i=0; i < 10; i++){
			int N = Integer.parseInt(br.readLine());
			arr[N%42] = true;
		}
		
		for(boolean x : arr){
			if(x == true){
				cnt++;
			}
		}

		System.out.println(cnt);
		br.close();
	}
}