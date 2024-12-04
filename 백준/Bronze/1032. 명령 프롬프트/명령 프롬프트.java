import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int N = Integer.parseInt(in.readLine());
        
        if(N == 1){
            System.out.print(in.readLine());
            return;
        }
        
        char[] charArr = in.readLine().toCharArray();
        int[] isSame = new int[charArr.length];
        for(int i=0; i<N-1; i++){
            char[] chs = in.readLine().toCharArray();
            for(int j=0; j<chs.length; j++){
                if(chs[j] == charArr[j]){
                    isSame[j]++;
                }
            }
        }
        
        for(int i=0; i<isSame.length; i++){
            if(isSame[i] == N-1){
                out.append(charArr[i]);
            } else {
                out.append("?");
            }
        }
        
        System.out.println(out);
    }
}