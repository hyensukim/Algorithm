import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr1 = br.readLine().split(" ");
        
        int N = Integer.parseInt(arr1[0]);
        int S = Integer.parseInt(arr1[1]);
        
        String[] arr2 = br.readLine().split(" ");
        int[] Ds = new int[N];
        
        for(int i=0; i < Ds.length; i++){
            int num = Integer.parseInt(arr2[i]);
            Ds[i] = Math.abs(S-num);
        }
        
        int result = Ds[0];
        for(int i=0; i < Ds.length; i++){
            result = gcd(result, Ds[i]);
        }
        
        br.close();
        System.out.println(result);
    }
    
    private static int gcd(int p, int q){
        if(q == 0) return p;
        return gcd(q, p%q);
    }
}