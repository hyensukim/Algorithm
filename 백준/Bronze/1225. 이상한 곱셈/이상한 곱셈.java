import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s1 = st.nextToken();
        String s2 = st.nextToken();

        long result = 0L;
        for(int i=0; i<s1.length(); i++){
            for(int j=0; j<s2.length(); j++){
                int num1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
                int num2 = Integer.parseInt(String.valueOf(s2.charAt(j)));
                result += num1 * num2;
            }
        }

        System.out.println(result);
    }
}