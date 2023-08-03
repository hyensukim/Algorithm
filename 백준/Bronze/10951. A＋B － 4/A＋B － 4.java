import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str; 
        try {
            while((str = br.readLine()) != null){
                st = new StringTokenizer(str, " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                sb.append(a+b).append("\n");
            }
        } catch (NumberFormatException | IOException e) {
            e.getMessage();
        }
        System.out.println(sb);
	}
}