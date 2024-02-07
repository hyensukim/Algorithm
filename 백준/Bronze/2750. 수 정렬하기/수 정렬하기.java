import java.io.*;

public class Main{
    static int[] arr;
    static int change;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        // 입력
        arr = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 버블 정렬
        bubbleSort(N-1);
        
        // 출력
        for(int i=0; i < arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    
    static void bubbleSort(int N){
        change = 0;
        
        for(int i = 0; i < N; i++){
            swap(i);
        }
        
        if(change == 0) {
            return;
        }
        else{
            N--;
            bubbleSort(N);
        }
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