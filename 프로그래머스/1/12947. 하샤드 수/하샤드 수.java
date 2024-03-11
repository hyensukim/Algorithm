class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String str = String.valueOf(x);
        
        int sum = 0;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            sum += Integer.parseInt(ch + "");
        }
        
        if(x % sum != 0){
            answer = false;
        }
        
        return answer;
    }
}