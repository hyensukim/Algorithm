class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int match = 0;
        
        int not_match = 0;
        
        char first = s.charAt(0);
        
        for(int i=0 ; i<s.length(); i++){
            if(first == s.charAt(i)){
                match++;
            }
            else{
                not_match++;
            }
            
            if(match == not_match){
                answer++;
                if(i+1 < s.length()){
                    first = s.charAt(i+1);
                }
            }
        }
        
        if(match != not_match)
            answer++;
        
        return answer;
    }
}