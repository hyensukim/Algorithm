class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
        int xNum = 0;
        int notXNum = 0;
        int answer = 1;
        for (int i=0;i<s.length();i++){
            if (x == s.charAt(i)){
                xNum++;
            } else {
                notXNum++;
            }
            if (xNum == notXNum){
                if (i==s.length()-1){
                    
                } else{
                    x = s.charAt(i+1);
                    xNum = 0;
                    notXNum = 0;
                    answer++;
                }            
            }
        }
        
        return answer;
    }
}