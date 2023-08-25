import java.io.*;
import java.text.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException, ParseException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currentDate = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int usableCount = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(int i =0; i < N; i++){
            String strDate = br.readLine();
            Date date1 = sdf.parse(currentDate);
            Date date2 = sdf.parse(strDate);
            if(date1.compareTo(date2) <= 0){
                ++usableCount;
            }
        }
        
        System.out.println(usableCount);
        br.close();
    }
}