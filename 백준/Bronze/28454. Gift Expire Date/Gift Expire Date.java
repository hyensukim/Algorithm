import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String today = br.readLine();
        StringTokenizer st = new StringTokenizer(today,"-");
        int y1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i < N; i++){
            String expiredDate = br.readLine();
            st = new StringTokenizer(expiredDate,"-");
            int y2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());
            // System.out.printf("%d - %d - %d\n",y2,m2,d2);
            boolean check = y1 < y2 || (y1==y2 && m1 < m2) || (y1 == y2 && m1 == m2 && d1 <= d2);
            if(check) cnt++;     
        }
        
        System.out.println(cnt);
        br.close();
    }
}