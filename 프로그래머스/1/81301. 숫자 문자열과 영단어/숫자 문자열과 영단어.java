class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char[] charArr = s.toCharArray();
        
        String str = "";
        String res = "";
        int idx = 0;
        for(char ch : charArr){
            
            if(ch >= 97 && ch <= 122){
                str += ch;
                
                int n = mti(str);
                
                if(n != -1){
                    res += n;
                    str = "";    
                }
                else{
                    continue;
                }
            }
   
            else if(ch >= 48 && ch <= 57){
                res += ch;
            }
        }
        
        answer = Integer.parseInt(res);
        
        return answer;
    }
    
    public int mti(String s){ // map To Int
        switch(s){
            case "zero" :
                return 0;
            case "one" :
                return 1;
            case "two" :
                return 2;
            case "three" :
                return 3;
            case "four" :
                return 4;
            case "five" :
                return 5;
            case "six" :
                return 6;
            case "seven" :
                return 7;
            case "eight" :
                return 8;
            case "nine" :
                return 9;
            default :
                return -1;
        }
    }
}