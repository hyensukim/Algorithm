import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer> deq = new LinkedList<>();
        int count = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for(int i=1; i <= N; i++){
            deq.offer(i);
        }
        
        int[] seq = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i < M; i++){
            seq[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        
        for(int i = 0; i < M; i++){
            int target_idx = deq.indexOf(seq[i]); // 해당 요소의 인덱스
            int half_idx;
            if(deq.size()%2 == 0){ // 요소 갯수가 짝수인 경우, 중간지점을 절반 크기의 -1값으로 지정
                half_idx = deq.size()/2 -1;
            }else{
                half_idx = deq.size()/2;
            }
            
            if(target_idx <= half_idx){
                for(int j=0; j < target_idx; j++){
                    deq.offerLast(deq.pollFirst());
                    count++;
                }
            }else{
                for(int j=0; j < deq.size() - target_idx; j++){
                    deq.offerFirst(deq.pollLast());
                    count++;
                }
            }
            deq.pollFirst();
        }
        
        System.out.println(count);
    }
}