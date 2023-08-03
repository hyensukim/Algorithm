import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a= sc.nextInt();//현재 시
        int b= sc.nextInt();//현재 분
        int c= sc.nextInt();//조리 시간(분)
        b+=(c%60);//현재분 + 조리시간

        if(c >= 60)a+=(c/60);
        
        if(b >= 60) {++a; b-=60;}

        if(a > 23) a-=24;

         System.out.printf("%d %d%n",a,b);
    }
}