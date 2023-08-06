import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int cnt = 0;

		for(int i=0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		int findNum = sc.nextInt();
		
		for(int i=0; i <n; i++){
			if(arr[i] == findNum)  cnt++;
		}

		System.out.println(cnt);

	}
}