import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i=0; i < N; i++){
            arr[i] = br.readLine();
        }

        br.close();

        //정렬
        Arrays.sort(arr, (s1,s2) -> {
            if(s1.length() == s2.length()){
                return s1.compareTo(s2);
            }else{
                return s1.length() - s2.length();
            }
        });

        // 중복 제거
        StringBuilder sb = new StringBuilder();
        /*for(int i=0; i < arr.length-1; i++){
            if(arr[i].compareTo(arr[i+1]) == 0){
                continue;
            }else{
                sb.append(arr[i]).append("\n");
            }
        }
        */
        
        sb.append(arr[0]).append('\n');
		
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				sb.append(arr[i]).append('\n');
			}
		}
        
        System.out.println(sb);
    }
}