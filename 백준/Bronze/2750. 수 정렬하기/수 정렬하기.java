import java.io.*;

public class Main{
    static int[] arr;
    static int change;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        arr = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        while(true){
            change = 0;
            for(int i=0; i < N-1; i++){
                swap(i);
            }
            if(change == 0) 
                break;
            else 
                N--;
        }
        
        for(int i=0; i < arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        
        br.close();
        System.out.println(sb);
    }
    
    static void swap(int i){
        if(arr[i] > arr[i+1]){
            int tmp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = tmp;
            change++;
        }
    }
}