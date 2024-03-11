class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] a = new boolean[10];
        
        for(int i=0; i<numbers.length; i++){
            int idx = numbers[i];
            a[idx] = true;
        }
        
        for(int i=0; i<a.length;i++){
            if(!a[i]){
                answer += i;
            }
        }
        
        return answer;
    }
}