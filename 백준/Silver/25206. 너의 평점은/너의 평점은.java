import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		double subScore = 0.0; // 학점

		double subSum = 0.0; // 학점 총합

		String grade; // 등급

		double score = 0.0; // 과목평점

		double sum = 0.0; // 학점 * 과목평점의 합

		String str; // 입력 한 줄

		while((str = br.readLine()) != null){

			st = new StringTokenizer(str, " ");

			st.nextToken();

			subScore = Double.parseDouble(st.nextToken());

			grade = st.nextToken();

			switch(grade){
				case "A+" :
				score = 4.5;
				break;

				case "A0" :
				score = 4.0;
				break;

				case "B+" :
				score = 3.5;
				break;

				case "B0" :
				score = 3.0;
				break;
				
				case "C+" :
				score = 2.5;
				break;

				case "C0" :
				score = 2.0;
				break;

				case "D+" :
				score = 1.5;
				break;

				case "D0" :
				score = 1.0;
				break;

				case "F" :
				score = 0.0;

				default :
				break;
			}

			if(grade.equals("P")) subScore = 0.0;
			sum += (subScore * score);
			subSum += subScore;

		}
		br.close();
		System.out.printf("%8.6f",sum/subSum);
	}
}