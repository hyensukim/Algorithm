import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()), xst_point=0, yst_point=0, area=0;

		StringTokenizer st;

		boolean[][] arr = new boolean[101][101];
		
		for(int i=0; i < N; i++){
			st = new StringTokenizer(br.readLine()," ");
			xst_point = Integer.parseInt(st.nextToken());
			yst_point = Integer.parseInt(st.nextToken());

			for(int j=0; j<10; j++){
				for(int k=0; k<10; k++){
					if(!arr[xst_point+j][yst_point+k]){
						++area;
						arr[xst_point+j][yst_point+k] = true;
					}
				}
			}
		}
		System.out.println(area);
		br.close();
	}
}