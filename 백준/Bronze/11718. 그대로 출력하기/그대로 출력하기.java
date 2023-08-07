import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str; 
        while((str = br.readLine()) != null){
            st = new StringTokenizer(str, "\n");
			str = st.nextToken();
            sb.append(str).append("\n");
        }
        System.out.println(sb);
	}
}