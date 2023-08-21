import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        /**
        1. N이 4, 7 일 때는 -1을 출력
        2. N이 5의 배수일 때는 몫을 출력
        3. N이 5의 배수 + 1 || 5의 배수 + 3인 경우, 몫에 1을 더해서 출력.
        4. N이 5의 배수 + 2 || 5의 배수 + 4인 경우, 몫에 2를 더해서 출력.
        */
        
        if(N == 4 || N == 7){
            System.out.println(-1);
        }else if((N % 5) == 1 || (N % 5) == 3){
            System.out.println((N / 5) + 1);    
        }else if((N % 5) == 2 || (N % 5) == 4){
            System.out.println((N / 5) + 2);
        }else if(N % 5 == 0){
            System.out.println(N / 5);
        }
        
        br.close();
    }
    
}