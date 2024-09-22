import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Tower[] stack = new Tower[N];
        int top = -1;
        for(int i=1; i<=N; i++) {
            int now = Integer.parseInt(st.nextToken());
            while(top >= 0 && stack[top].high < now) {
                top--;
            }
            if(top == -1) {
                sb.append(0).append(" ");
            } else {
                sb.append(stack[top].idx).append(" ");
            }
            
            stack[++top] = new Tower(i,now);
        }
        br.close();
        System.out.println(sb);
    }
}

class Tower{
        public int idx;
        public int high;
        
        public Tower(int idx, int high){
            this.idx = idx;
            this.high = high;
        }
}