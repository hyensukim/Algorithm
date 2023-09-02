import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result= "";
        int multiply = 0;
        for(int i=0; i<3; i++){
            String resistance = br.readLine();
            String val = "";
            switch(resistance){
                case "black" : 
                    val = "0";
                    multiply = 1;
                    break;
                case "brown" :
                    val = "1";
                    multiply = 10;
                    break;
                case "red" :
                    val = "2";
                    multiply = 100;
                    break;
                case "orange" :
                    val = "3";
                    multiply = 1000;
                    break;
                case "yellow" :
                    val = "4";
                    multiply = 10000;
                    break;
                case "green" :
                    val = "5";
                    multiply = 100000;
                    break;
                case "blue" :
                    val = "6";
                    multiply = 1000000;
                    break;
                case "violet" :
                    val = "7";
                    multiply = 10000000;
                    break;
                case "grey" :
                    val = "8";
                    multiply = 100000000;
                    break;
                case "white" :
                    val = "9";
                    multiply = 1000000000;
                    break;
            }
            if(i < 2)
                result += val;
        }
        
        long intRes = Long.parseLong(result) * multiply;
        result = String.valueOf(intRes);
        
        System.out.println(result);
        br.close();
    }
}
