import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        boolean[] checked = new boolean[10];
        
        for(String s : X.split("")){
            int idx = Integer.parseInt(s);
            xArr[idx]++;
        }
        
        for(String s : Y.split("")){
            int idx = Integer.parseInt(s);
            yArr[idx]++;
        }
        
        ArrayList<Integer> li = new ArrayList<>();
        
        for(int i=9; i>=0; i--){
            if(xArr[i] > 0 && yArr[i] > 0){
                li.add(i);
            }
        }
        
        if(li.isEmpty())
            answer = "-1";
        else if(li.size() == 1 && li.get(0) == 0)
            answer = "0";
        else{
            for(int n : li){
                String s = "";
                if(xArr[n] >= yArr[n]){
                    s = String.valueOf(n).repeat(yArr[n]);
                }
                else{
                    s = String.valueOf(n).repeat(xArr[n]);
                }
                answer += s;
            }
        }
        
        // for(int i=9; i>=0; i--){
        //     if(checked[i]){
        //         if(xArr[i] >= yArr[i]){
        //             answer.repeat(yArr[i]);
        //         }
        //         else{
        //             answer.repeat(xArr[i]);
        //         }
        //     }
        // }
        
        return answer;
    }
}