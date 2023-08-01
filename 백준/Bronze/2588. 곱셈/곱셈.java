import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();//1 10 100
        
        int B100 = B/100;
        int B1 = B%10;
        int B10 = (B-(B100 * 100 +B1))/10;
        
        StringBuilder sb = new StringBuilder();
        sb.append(B1 * A).append("\n");
        sb.append(B10 * A).append("\n");
        sb.append(B100 * A).append("\n");
        sb.append(A*B).append("\n");
        
        System.out.println(sb);
    }
}