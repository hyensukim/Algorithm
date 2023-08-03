import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = "";

        if(n%4==0){ 
            n/=4;
            for(int i=0; i<n; i++){
                str+="long ";
            }
            System.out.println(str+"int");
        }
    }
}