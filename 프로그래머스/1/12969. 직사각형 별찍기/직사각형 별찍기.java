import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++){
            String str = "";
            
            for(int j=0; j<a; j++){
                str += "*";
            }
            
            sb.append(str).append("\n");
        }
        
        System.out.println(sb);
    }
}