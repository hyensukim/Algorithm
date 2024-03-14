class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int cursor = 0;
        for(int x : section){
            if(cursor <= x){
                answer++;
                cursor = x+m;
            }
        }
        
        return answer;
    }
}