import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        int N = sc.nextInt();
        for(int i=1; i<=N;i++){
            for(int j=1;j<=i;j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
	}
}