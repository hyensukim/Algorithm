import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        StringBuilder sb = new StringBuilder();
        
        while(!((str = br.readLine().toUpperCase()).equals("#"))){
            int count = 0;
            int[] arr = str.chars().toArray();
            for(int a : arr){
                if(a == 65){
                    count++;
                }else if(a == 69){
                    count++;
                }else if(a == 73){
                    count++;
                }else if(a == 79){
                    count++;
                }else if(a == 85){
                    count++;
                }
            }
            sb.append(count).append('\n');
        }
        
        System.out.println(sb);
        br.close();
    }
}