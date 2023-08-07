import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		String strA = "";
		String strB = "";
		
		for(int i=2; i>=0;i--){
			char a = A.charAt(i);
			strA += Character.toString(a);

			char b = B.charAt(i);
			strB += Character.toString(b);
		}

		int a = Integer.parseInt(strA);
		int b = Integer.parseInt(strB);

		int result = a > b ? a : b;

		System.out.println(result);
	}
}