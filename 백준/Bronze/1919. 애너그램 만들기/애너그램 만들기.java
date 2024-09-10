import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[2][26];
        for(int i=0; i<2; i++){
            String str = br.readLine();
            char[] chars = str.toCharArray();
            for(char ch : chars) {
                arr[i][ch - 97]++;
            }
        }
        
        long sum = 0;
        for(int i=0; i<26; i++){
            if(arr[0][i] != arr[1][i]){
                sum += (Math.abs(arr[0][i] - arr[1][i]));
            }
        }
        br.close();
        
        System.out.println(sum);
    }
}