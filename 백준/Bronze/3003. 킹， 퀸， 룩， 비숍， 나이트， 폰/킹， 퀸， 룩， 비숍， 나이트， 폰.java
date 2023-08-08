import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args)throws IOException {
      // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
      //1 1 2 2 2 8
        int A = 1, B = 2, C = 8;
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<6; i++){
            int n = Integer.parseInt(st.nextToken());

            if(i==0){sb.append(A-n).append(" ");}
            else if(i==1){sb.append(A-n).append(" ");}
            else if(i==2){sb.append(B-n).append(" ");}
            else if(i==3){sb.append(B-n).append(" ");}
            else if(i==4){sb.append(B-n).append(" ");}
            else {sb.append(C-n);}

        }
        br.close();
        System.out.println(sb);
    }
}