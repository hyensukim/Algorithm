import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int max = 1;
		max = a > b ? a : b;
		max = max > c ? max : c;

		int result = 0;

		if((a == b && a == c) || ((a + b + c - max) > max)){
			result = a + b + c;
		}else if((a + b + c - max) <= max){
			result = ((a + b + c - max) * 2) - 1;
		}

		System.out.println(result);
		br.close();
	}
}