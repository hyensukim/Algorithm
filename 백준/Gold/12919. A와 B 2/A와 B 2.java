import java.io.*;
import java.util.*;
public class Main {
    static int result = 0;
    static String S,T;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        S = br.readLine();
        T = br.readLine();

        br.close();

        findAB(S);

        System.out.println(result);
    }

    static void findAB(String s){
        if(s.length() >= T.length()){
            if(s.equals(T)){
                result = 1;
            }
            return;
        }
        // // T에 포함되어 있지 않다면 더 이상 진행하지 않음
        if (!T.contains(s) && !T.contains(new StringBuilder(s).reverse().toString())) {
            return;
        }

        findAB(new StringBuilder(s + 'A').toString());
        findAB(new StringBuilder(s + 'B').reverse().toString());
    }
}
