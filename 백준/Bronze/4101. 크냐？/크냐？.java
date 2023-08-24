import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        StringBuilder sb = new StringBuilder();
        while(!(str = br.readLine()).equals("0 0")){
            StringTokenizer st = new StringTokenizer(str," ");
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            
            if(n1 > n2){
                sb.append("Yes").append("\n");
            }else{
                sb.append("No").append("\n");
            }
        }
        
        System.out.println(sb);
        br.close();
    }
}