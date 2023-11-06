import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String[] arr = br.readLine().split(" ");

            int n = Integer.parseInt(arr[0]);
            int[] nums = new int[n];

            for(int i = 0; i < nums.length; i++){
                nums[i] = Integer.parseInt(arr[i+1]);
            }

            long sum = 0;

            for(int i=0; i < nums.length-1; i++){
                for(int j=i+1; j < nums.length; j++){
                    sum += getGcd(nums[i], nums[j]);
                }
            }
            
            sb.append(sum).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    
    private static int getGcd(int p, int q){
        if(p < q){
            int tmp = p;
            p = q;
            q = tmp;
        }
        if(q == 0) return p;
        return getGcd(q,p%q);
    }
}