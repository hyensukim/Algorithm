class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long total_fee = 0;
        
        for(int i=1; i<=count; i++){
            total_fee += price * i;
        }
        
        answer = total_fee > money ? total_fee - money : 0;

        return answer;
    }
}