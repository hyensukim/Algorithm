import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int mid = str.length()/2;

        int result = 1;

        for(int i=0; i < mid; i++){
            if(str.charAt(i) != str.charAt(str.length()-(i+1))){
                result=0;
            }
        }

        System.out.println(result);
    }
}