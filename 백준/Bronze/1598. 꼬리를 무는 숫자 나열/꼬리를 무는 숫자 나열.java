import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());

        if(x > y) {
            double tmp = y;
            y = x;
            x = tmp;
        }

        int dx = (int)Math.ceil(x/4);
        int dy = (int)Math.ceil(y/4);

        int share = dy - dx;
        int remain = (int)Math.abs(((4 * (dy-1)) - y) - ((4 * (dx-1)) - x));

        System.out.println(share + remain);
    }
}