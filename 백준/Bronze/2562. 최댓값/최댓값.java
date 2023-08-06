import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<9; i++){
			list.add(Integer.parseInt(br.readLine()));
		}
		br.close();
		int max = list.stream().mapToInt(Integer::intValue).max().getAsInt();
		int index = list.indexOf(max);
		System.out.println(max);
		System.out.println(index+1);
	}
}