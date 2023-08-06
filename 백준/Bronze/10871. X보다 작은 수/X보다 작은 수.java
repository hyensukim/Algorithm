import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
        
		String[] strArr = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(String a : strArr){
            if(Integer.parseInt(a) < x){
                sb.append(a).append(" ");
            }    
        }

		System.out.println(sb);
		br.close();

	}
}