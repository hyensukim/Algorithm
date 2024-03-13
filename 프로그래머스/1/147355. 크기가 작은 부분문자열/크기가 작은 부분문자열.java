class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int lenT = t.length();
        
        int lenP = p.length();
        
        for(int i = 0; i <= lenT-lenP; i++){
            
            String s = t.substring(i,i+lenP);
            
            long intS = Long.parseLong(s);
            
            long intP = Long.parseLong(p);
            
            if(intS <= intP){
                answer++;
            }
        }
        
        return answer;
    }
}