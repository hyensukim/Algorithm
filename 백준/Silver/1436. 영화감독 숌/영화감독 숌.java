import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int start = 666; // 영화 제목 시리즈
        int cnt = 1; // 영화 갯수

        while(cnt != N){

            start++;

            if(String.valueOf(start).contains("666")){
                cnt++;
            };
        }
        
        System.out.println(start);
        br.close();
    }
}