import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < 3; i++){
            sb.append(findYut(br.readLine())).append("\n");
        }
        
        br.close();
        
        System.out.println(sb);
    }
    
    static String findYut(String s){
        // 0 1 0 1
        StringTokenizer st = new StringTokenizer(s);
        
        int count = 0;
        
        String result;
        
        while(st.hasMoreTokens()){
            String str = st.nextToken();
            if("0".equals(str)){
                count++;
            }
        }
        
        switch(count){
            case 1 :
                result = "A";
                break;
            case 2 :
                result = "B";
                break;
            case 3 :
                result = "C";
                break;
            case 4 :
                result = "D";
                break;
            default :
                result = "E";
                break;
        }
        
        return result;
    }
}
