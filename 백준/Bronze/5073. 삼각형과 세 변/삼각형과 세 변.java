import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		String str;

		while(true){
			str = br.readLine();

			StringTokenizer st = new StringTokenizer(str," ");

			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int max = a > b ? a : b;
			max = max > c ? max : c;

			if( a + b + c == 0){
				break;
			}else if((max == a && max - (b + c) >= 0) ||
				   (max == b && max - (a + c ) >= 0) ||
				   (max == c && max - (a + b) >= 0)){
					sb.append("Invalid").append("\n");
					continue;
			}

			if(a == b && a == c){
				sb.append("Equilateral").append("\n");
			}else if(a == b || b == c || c == a){
				sb.append("Isosceles").append("\n");
			}else{
				sb.append("Scalene").append("\n");
			}
		}

		System.out.println(sb);
		br.close();
	}
}