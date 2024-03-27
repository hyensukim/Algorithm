import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sArr = br.readLine().split(" ");
        br.close();
        
        int dice1= Integer.parseInt(sArr[0]);
        int dice2= Integer.parseInt(sArr[1]);
        int dice3= Integer.parseInt(sArr[2]);
        int price = 0;
        
        if(dice1 == dice2 && dice2 == dice3){
            price = 10_000 + dice1 * 1_000;
        }
        else if(dice1 == dice2 || dice1 == dice3){
            price = 1_000 + dice1 * 100;
        }
        else if(dice2 == dice3){
            price = 1_000 + dice2 * 100;
        }
        else{
            price = Math.max(dice1, Math.max(dice2,dice3)) * 100;
        }
        
        System.out.println(price);
    }
}