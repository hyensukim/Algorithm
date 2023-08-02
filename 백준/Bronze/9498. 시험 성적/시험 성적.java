import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score % 10 != 0) score = score/10*10;
        switch(score){
            case 100 :
            case 90 :
            System.out.println("A");
            break;
            case 80 :
            System.out.println("B");
            break;
            case  70 :
            System.out.println("C");
            break;
            case 60 :
            System.out.println("D");
            break;
            default :
            System.out.println("F");
        }
    }
}