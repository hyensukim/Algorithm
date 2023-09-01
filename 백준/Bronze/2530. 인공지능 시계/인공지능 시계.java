import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        /**
        1. 요리시간(s) + 현재 초 >= 60
            - 60으로 나눈 몫 => 현재 분 + 몫
            - 60 나머지 연산 => 종료 초
        2. 현재 분  + 몫 >= 60
            - 60으로 나눈 몫 => 현재 시 + 몫
            - 60 나머지 연산 => 종료 분
        3. 현재 시 + 몫 >= 24
            - 24로 나눈 나머지 => 종료 시
        */
        
        int hrs = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int sec = Integer.parseInt(st.nextToken());
        int c_sec = Integer.parseInt(br.readLine());
        
        sec = sec + c_sec;
        
        if(sec >= 60){
            min = min + (sec/60);
            sec = sec%60;
        }
        
        if(min >= 60){
            hrs = hrs + (min/60);
            min = min%60;
        }
        
        if(hrs >= 24){
            hrs = hrs % 24;
        }
        
        System.out.printf("%d %d %d\n",hrs,min,sec);
        br.close();
    }
}