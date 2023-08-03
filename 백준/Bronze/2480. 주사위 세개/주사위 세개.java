import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();//주사위1
        int b= sc.nextInt();//주사위2
        int c= sc.nextInt();//주사위3
        int price = 0;

        if(a == b && b == c){price = 10000 + a*1000;}
        else if(a==b || a==c){price = 1000 + a*100;}
        else if(b==c){price = 1000 + b*100;}
        else{ price = a > b ? (a > c ? a*100 : c *100) : (b > c ? b*100 : c*100);}

        System.out.println(price);
    }
}