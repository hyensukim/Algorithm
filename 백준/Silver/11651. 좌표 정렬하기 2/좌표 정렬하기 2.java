import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        
        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        Arrays.sort(arr,(e1,e2) ->{
            if(e1[1] != e2[1]){
                return e1[1] - e2[1];
            }else{
                return e1[0] - e2[0];
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < arr.length; i++){
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}