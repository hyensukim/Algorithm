class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 65 && arr[i] <= 90){ // 대문자
                arr[i] += n;
                
                if(arr[i] > 90){
                    int tmp = arr[i] - 91;
                    arr[i] = (char)(65 + tmp);
                }
            }
            else if(arr[i] >= 97 && arr[i] <= 122){ //소문자
                arr[i] += n;
                
                if(arr[i] > 122){
                    int tmp = arr[i] - 123;
                    arr[i] = (char)(97 + tmp);
                }
            }
            answer += arr[i];            
        }
        
        return answer;
    }
}