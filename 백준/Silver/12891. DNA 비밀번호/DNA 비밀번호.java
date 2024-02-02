import java.io.*;
import java.util.*;

public class Main{

    static int checkArr[]; // 만족 갯수
    static int myArr[];  // 부분 비번 글자 내 갯수
    static int checkSecret; // 4글자 모두 만족 시 증가

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken()); // DNA 글자수
        int P = Integer.parseInt(st.nextToken()); // 부분 비번 글자수
        int res = 0; // 결과
        char[] DNA = new char[S];
        checkArr = new int[4]; 
        myArr = new int[4]; 
        checkSecret = 0; 
        DNA = br.readLine().toCharArray(); // DNA 배열
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0) 
                checkSecret++;
        }

        for(int i=0; i <P; i++){
            Add(DNA[i]);
        }

        if(checkSecret == 4) res++;

        for(int i=P; i < S; i++){
            int j = i-P;
            Add(DNA[i]);
            Remove(DNA[j]);
            if(checkSecret == 4) res++;
        }

        br.close();
        System.out.println(res);
    }

    static void Add(char c){
        switch(c){
            case 'A' :
                myArr[0]++;
                if(checkArr[0] == myArr[0])
                    checkSecret++;
                break;
            case 'C' :
                myArr[1]++;
                if(checkArr[1] == myArr[1])
                    checkSecret++;
                break;
            case 'G' :
                myArr[2]++;
                if(checkArr[2] == myArr[2])
                    checkSecret++;
                break;
            case 'T' :
                myArr[3]++;
                if(checkArr[3] == myArr[3])
                    checkSecret++;
                break;
        }
    }

    static void Remove(char c){
        switch(c){
            case 'A' :
                if(myArr[0] == checkArr[0])
                    checkSecret--;
                myArr[0]--;
                break;
            case 'C' :
                if(myArr[1] == checkArr[1])
                    checkSecret--;
                myArr[1]--;
                break;
            case 'G' :
                if(myArr[2] == checkArr[2])
                    checkSecret--;
                myArr[2]--;
                break;
            case 'T' :
                if(myArr[3] == checkArr[3])
                    checkSecret--;
                myArr[3]--;
                break;
        }
    }
}