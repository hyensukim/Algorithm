import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] N = new int[3];

		for(int i=0; i<3; i++){
			N[i] = Integer.parseInt(br.readLine());
		}

		int sum = Arrays.stream(N).sum();
		
		boolean is60 = Arrays.stream(N).allMatch(i -> i == 60);

		boolean isSame = false;

		Outter:for(int i=0; i < N.length; i++){
			for(int j=0; j < N.length; j++){
				if(i != j && N[i] == N[j]){
					isSame = true;
					if(isSame) break Outter;
				}
			}
		}

		if(is60){
			System.out.println("Equilateral");
		}else if(sum == 180 && isSame){
			System.out.println("Isosceles");
		}else if(sum == 180 && !isSame){
			System.out.println("Scalene");
		}else{
			System.out.println("Error");
		}

		br.close();
	}
}