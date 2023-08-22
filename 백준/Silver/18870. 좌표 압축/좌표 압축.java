import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        /**
        1. x1값 지정, x1보다 작은 값 xj의 갯수.
        2. xj는 중복되지 않는다.즉, 100 99 99인 경우, 100기준 1개이다. 99가 2개이므로 1개로 취급
        기준값 정한 뒤 비교할 xj 값들을 HashSet에 담는다.
        - 시간초과
        
        1. Map으로 랭킹을 매긴 뒤 해당 랭킹값을 출력
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i < arr.length; i++){
            arr[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(sorted);
        int rank = 0;
        for(int v : sorted){
            if(!map.containsKey(v)){
                map.put(v,rank);
                rank++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int k : arr){
            int ranked = map.get(k);
            sb.append(ranked).append(" ");
        }
        
        System.out.println(sb);
        br.close();
    }
}