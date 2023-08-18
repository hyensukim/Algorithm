import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = 0;

        Outter:for(int i=0; i < card.length-2; i++){

            for(int j=i+1; j < card.length-1; j++){

                for(int k = j+1; k < card.length; k++){
                    int result = card[i] + card[j] + card[k];
                    if(M-result == 0){
                        max = result;
                        break Outter;
                    }else if(M-result > 0){
                        max = result > max ? result : max;
                    }
                }
            }
        }

        System.out.println(max);
        br.close();
    }
}