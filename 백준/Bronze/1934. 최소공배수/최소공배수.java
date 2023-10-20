import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int gcd = gcd(a,b);
            sb.append(gcd *(a/gcd) * (b/gcd)).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    
    private static int gcd(int q, int p){ // gcd : greatest common divisor
        int a = 0;
        if(q < p){
            a = q;
            q = p;
            p = a;
        }
        if(p == 0) return q;
        return gcd(p,q%p);
    }
}