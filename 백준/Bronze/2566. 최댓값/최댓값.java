import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int [][] A = new int[9][9];

		int subMax[] = new int[9];

		int max = 0;

		int row = 0, col = 0;
		
		for(int i=0; i < A.length ; i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j < A[i].length; j++){
				A[i][j] = Integer.parseInt(st.nextToken());
				subMax[i] = Arrays.stream(A[i]).max().getAsInt();
				max = Arrays.stream(subMax).max().getAsInt();
				if(A[i][j] == max){
					row = i+1;
					col = j+1;
				}
			}
		}
		System.out.println(max);
		System.out.println(row +" " + col);
		br.close();
	}
}