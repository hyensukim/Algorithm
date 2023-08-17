import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a1A0 = br.readLine();
        StringTokenizer st = new StringTokenizer(a1A0," ");

        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean is1 = ((a1 * n0) + a0) <= (c * n0);
        boolean cBetterA1 = a1 <= c;
        if(is1 && cBetterA1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        br.close();
    }
}