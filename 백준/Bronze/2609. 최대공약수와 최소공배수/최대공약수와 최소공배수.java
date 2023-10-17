import java.io.*;
import java.util.*;

public class Main{

    static int maxDiv = 0;
    static int minSup = 0;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        getMaxDiv(n1, n2);
        
        minSup = (maxDiv) * (n1/maxDiv) * (n2/maxDiv);
        
        System.out.println(maxDiv + "\n" + minSup);
    }

    private static void getMaxDiv(int n1, int n2){
        int r = Integer.MAX_VALUE;
        while(true){
            if(n1 > n2){
                r = n1 % n2;
                if(r ==0){
                    maxDiv = n2;
                    break;
                }
                n1 = r;
            }else{
                r = n2 % n1;
                if(r ==0){
                    maxDiv = n1;
                    break;
                }
                n2 = r;
            }
        }
    }
}