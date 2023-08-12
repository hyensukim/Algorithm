import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine()); // 입력값
		
		int level = 1;

		int stack = 0;

		String str = "";

		while(true){
			if(X <= level + stack){
				if(level%2 == 1){
					str=(level-(X-stack-1))+"/"+(X-stack);
					break;
				}else{
					str=(X-stack)+"/"+(level-(X-stack-1));
					break;
				}
			}else{
				stack += level;
				level++;
			}
		}

		System.out.println(str);
		br.close();
	}
}