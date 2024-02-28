import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int count = 0;
        
        List<Integer> li = new ArrayList<>();
        
        for(int i=0; i<7; i++){
            int n = Integer.parseInt(br.readLine());
            
            if(n%2 == 1){
                count++;
                li.add(n);
            }
        }
        
        if(count != 0 ){
            int sum = 0;
            
            for(int i = 0; i < li.size(); i++){
                sum += li.get(i);
            }
            
            System.out.println(sum);
            System.out.println(Collections.min(li));
        }else{
            System.out.println(-1);
        }
        
        br.close();
    }
}