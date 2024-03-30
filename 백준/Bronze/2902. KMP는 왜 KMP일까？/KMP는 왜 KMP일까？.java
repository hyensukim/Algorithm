import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        
        while(st.hasMoreTokens()){
            sb.append(String.valueOf(st.nextToken().charAt(0)));
        }
        
        br.close();
        
        System.out.println(sb);
    }
}