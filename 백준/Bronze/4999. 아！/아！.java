import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a1 = br.readLine();
        String a2 = br.readLine();
        
        if(a1.length() >= a2.length())
            System.out.println("go");
        else
            System.out.println("no");
        br.close();
    }
}