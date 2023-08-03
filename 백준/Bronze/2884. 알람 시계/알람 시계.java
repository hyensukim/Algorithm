import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int hrs = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        
        if(min >= 45){
            min -= 45;
        }else{
            min = (min - 45) + 60;
            if(hrs == 0){
                hrs = 23;
            }else{
                --hrs;
            }
        }
        
        System.out.println(hrs + " " + min);
        br.close();
    }
}