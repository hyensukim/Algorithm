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

        long sum1 = 0;
        long sum2 = 0;

        for(char c : s1.toCharArray()){
            sum1 += c - '0';
        }

        for(char c : s2.toCharArray()){
            sum2 += c - '0';
        }
        
        long result = sum1 * sum2;
        System.out.println(result);
    }
}
