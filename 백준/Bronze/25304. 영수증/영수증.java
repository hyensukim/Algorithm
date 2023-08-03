import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int all = Integer.parseInt(br.readLine());
        int _total = 0;
        int _all = 0;

        for(int i=0; i < all; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            if(price != 0 || count != 0){
                _all++;
                _total+=(price*count);
            }
        }
        System.out.printf("%s", total == _total && all == _all ? "Yes" : "No");
    }
}