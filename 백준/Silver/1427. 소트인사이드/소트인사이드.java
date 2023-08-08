import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        String str = br.readLine();
        
        for(long i=0 ; i < str.length(); i++){
            list.add(Integer.valueOf(str.charAt(Integer.parseInt(i+""))+""));
        }
        
        Object[] arr = list.stream().sorted(Comparator.reverseOrder()).toArray();
        
        StringBuilder sb = new StringBuilder();
        for(Object obj : arr){
            sb.append(obj);
        }
        
        System.out.println(sb);
        br.close();
    }
}