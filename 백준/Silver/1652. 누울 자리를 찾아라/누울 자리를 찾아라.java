import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int row_count = 0; // 가로
        int col_count = 0; // 세로
        
        String[][] sArr = new String[n][n];
        
        for(int i=0; i<n; i++){
            sArr[i] = br.readLine().split("");
        }
        
        // 가로 갯수
        for(int i=0; i<sArr.length; i++){
            int dot_count = 0;
            
            for(int j=0; j<sArr[i].length; j++){
                String s = sArr[i][j];
                
                if(".".equals(s)){
                    dot_count++;
                }
                else{
                    if(dot_count > 1){
                        row_count++;
                        dot_count = 0;
                    }
                    else{
                        dot_count = 0;
                    }
                }
            }
            
            // 끝에 남은 도트
            if(dot_count > 1){
                row_count++;
            }
        }
        
        // 세로 갯수
        for(int i=0; i<sArr.length; i++){
            int dot_count = 0;
            
            for(int j=0; j<sArr[i].length; j++){
                String s = sArr[j][i];
                
                if(".".equals(s)){
                    dot_count++;
                }
                else{
                    if(dot_count > 1){
                        col_count++;
                        dot_count = 0;
                    }
                    else{
                        dot_count = 0;
                    }
                }
            }
            
            // 끝에 남은 도트
            if(dot_count > 1){
                col_count++;
            }
        }
        
        br.close();
        
        System.out.println(row_count + " " + col_count);
    }
}