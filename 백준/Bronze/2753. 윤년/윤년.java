import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        boolean isLeap = false;

        if((y%4==0&&y%100!=0)||y%400==0) isLeap=true;

        System.out.println(isLeap ? 1 : 0);
    }
}