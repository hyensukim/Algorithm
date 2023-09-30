import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            String str = br.readLine();
            String[] arr = str.split(" ");
            
            for(int j=0; j < arr.length; j++){
                String tmp = arr[j];
                StringBuilder sb2 = new StringBuilder(tmp);
                tmp = sb2.reverse().toString();
                sb.append(tmp).append(" ");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}