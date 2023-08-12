import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine()); // 입력값
		int level = 1;// 레벨
		int stack = 0;// 누적 합
		String str = "";// 결과

		if(X == 1){ str="1/1";}
		else{
			while(X > level + stack){
				stack += level;
				level++;
			}

			if(level%2 == 1){// Lv 홀수
				str = (level + 1 -X + stack) + "/" + (X-stack); //  분자 = 레벨 + 1 - 분모
			}else{ // Lv 짝수
				str = (X-stack) + "/" + (level + 1 -X + stack);
			}
		}
		System.out.println(str);
		br.close();
	}
}