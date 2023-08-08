import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];

        int cnt = 0;

        for(int i =0; i < 26; i++){

            for(int j=0; j < str.length(); j++){

                if(i+'A' == str.charAt(j)){
                    arr[i] += ++cnt;
                }
                cnt = 0;
            }

        }
       
        int max = Arrays.stream(arr).max().getAsInt();
        int maxIndex = 0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] == max){
                ++cnt;
                maxIndex = i;
            }
        }

        if(cnt >= 2){
            System.out.println("?");
        }else{
            System.out.println((char)(maxIndex+ 'A'));
        }
    }
}