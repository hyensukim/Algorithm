import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt( br.readLine());

		boolean isgrp; // 그룹 번호 여부 확인
		int grpNumCnt = 0; // 그룹 번호 카운트

		for(int i=0; i < N; i++){

			String str = br.readLine();
			isgrp = true;

			for(int j = 0; j < str.length(); j++){
				char ch = str.charAt(j);
				int index = str.lastIndexOf(ch);
				if(j != index){
					if( index != j+1 && ch != str.charAt(j+1)){
						isgrp = false;
						break;
					}
				}
			}
			if(isgrp){
				++grpNumCnt;
			}
		}
		System.out.println(grpNumCnt);
		br.close();
	}
}