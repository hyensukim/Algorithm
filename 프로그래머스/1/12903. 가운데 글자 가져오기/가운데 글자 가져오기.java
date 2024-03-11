class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        int mid_idx = len / 2;
        
        if(len % 2 == 0){
            answer += (s.charAt(mid_idx-1)+""+s.charAt(mid_idx));
        }
        else{
            answer += s.charAt(mid_idx);
        }
        
        return answer;
    }
}