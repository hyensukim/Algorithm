import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int F = Integer.parseInt(br.readLine());
        
        int N2 = (N/100)*100;
        int sub = 0;
        for(int i=0; i < 100; i++){
            int tmp = N2;
            tmp = N2+i;         
            if(tmp%F == 0){
                sub = tmp%100;
                break;
            }
        }
        
        if(sub < 10){
            System.out.printf("0%d%n",sub);
        }else{
            System.out.println(sub);
        }
        br.close();
    }
}