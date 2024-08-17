import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int[] resArr = new int[26];
        char[] chars = s.toCharArray();
        for(char ch : chars){
            resArr[ch-97]++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i : resArr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        br.close();
    }
}