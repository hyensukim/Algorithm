import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[8][8];
        for(int i=0; i<8; i++){
            String str = br.readLine();
            for(int j=0; j < 8; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        int count = 0;
        for(int i=0; i<8; i++){
            for(int j=0; j < 8; j++){
                if(arr[i][j] == 'F'){
                    if(i%2 == 0 && j%2 == 0) count++;
                    else if(i%2 == 1 && j%2 ==1) count++;
                }
            }
        }
        
        System.out.println(count);
        br.close();
    }
}