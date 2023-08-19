import java.io.*;
import java.util.*;

public class Main{

    public static boolean[][] chess;
    public static int min = 64;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        chess = new boolean[N][M];

        for(int i=0; i < N; i++){
            String str = br.readLine();
            for(int j=0; j < M; j++){
                if(str.charAt(j) == 'W'){
                    chess[i][j] = true;
                }else{
                    chess[i][j] = false; 
                }
            }
        }
        
        int numOfRow = N - 7;
        int numOfCol = M - 7;

        for(int i = 0; i < numOfRow; i++){
            for(int j = 0; j < numOfCol; j++){
                check(i,j);
            }
        }

        System.out.println(min);
        br.close();
    }

    public static void check(int x, int y){
        int endOfRow = x + 8;
        int endOfCol = y + 8;
        int cnt = 0;
        boolean firstCh = chess[x][y];// 첫째항

        for(int i=x; i < endOfRow; i++){
            for(int j=y; j < endOfCol; j++){
                if(chess[i][j] != firstCh){
                    cnt++;
                }
                firstCh = (!firstCh);
            }
             firstCh = !firstCh;
        }

        cnt = Math.min(cnt, 64-cnt);

        min = Math.min(min, cnt);
    }
    
}