import java.io.*;
import java.math.BigInteger;
public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        
        BigInteger factorial = new BigInteger("1");
        if(N > 0){
            for(int i=1; i<=N; i++){
                factorial = factorial.multiply(new BigInteger(i+""));
            }
        }
        
        int cnt = 0;
        String num = String.valueOf(factorial);
        char[] chars = num.toCharArray();
        for(int i = chars.length -1; i >=0; i-- ){
            if(chars[i] == '0'){
                cnt++;
            }else{
                break;
            }
        }
        
        System.out.println(cnt);
    }
}