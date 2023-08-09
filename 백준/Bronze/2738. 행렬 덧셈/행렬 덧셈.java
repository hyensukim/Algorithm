import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");

		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());

		int M = Integer.parseInt(st.nextToken());

		int [][] A = new int[N][M];

		int [][] B = new int[N][M];

		for(int i=0; i < A.length; i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j < A[i].length; j++){				
				A[i][j] = Integer.parseInt(st.nextToken());		
			}
		}

		for(int i=0; i < B.length; i++){
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j < B[i].length; j++){
				B[i][j] = Integer.parseInt(st.nextToken());
				A[i][j] += B[i][j];
				sb.append(A[i][j]).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
		br.close();
	}
}