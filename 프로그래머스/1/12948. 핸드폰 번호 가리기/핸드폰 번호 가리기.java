class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int len = phone_number.length();
        
        String back4 = phone_number.substring(len-4,len);
        
        for(int i=0; i<len-4; i++){
            answer += "*";
        }
        
        return answer + back4;
    }
}