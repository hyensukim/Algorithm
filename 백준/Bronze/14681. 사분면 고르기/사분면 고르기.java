import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = x*y > 0 && x>0 ? 1 : x*y > 0 && x < 0 ? 3 :
        x*y < 0 && x < 0 ? 2 : 4;

        System.out.println(result);
    }
}