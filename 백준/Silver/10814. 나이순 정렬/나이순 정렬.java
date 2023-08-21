import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];
        for(int i=0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }
       
        Arrays.sort(arr,(s1,s2)->{
            int n1 = Integer.parseInt(s1[0]);
            int n2 = Integer.parseInt(s2[0]);
            int result = 0;
            if(n1 != n2){
                result = n1 - n2;
            }

            return result;
        });
        
        StringBuilder sb=  new StringBuilder();
        for(int i=0; i < N; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}