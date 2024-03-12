class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        int len = s.length();
        
        if(len == 4 || len == 6)
            answer = true;
        
        for(char ch : s.toCharArray()){
            if(ch < 48 || ch > 57){
                answer = false;
            }
        }
        
        return answer;
    }
}