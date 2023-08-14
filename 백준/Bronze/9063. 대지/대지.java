import java.io.*;
import java.util.*;

public class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[] X = new int[N];

		int[] Y = new int[N];

		int area = 0;

		for(int i=0; i<N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			X[i] = Integer.parseInt(st.nextToken());
			Y[i] = Integer.parseInt(st.nextToken());
		}

		int minX = Arrays.stream(X).min().getAsInt();
		int maxX = Arrays.stream(X).max().getAsInt();

		int minY = Arrays.stream(Y).min().getAsInt();
		int maxY = Arrays.stream(Y).max().getAsInt();


		if(N > 1) area = (maxX - minX) * (maxY - minY);

		System.out.println(area);

		br.close();
	}
}