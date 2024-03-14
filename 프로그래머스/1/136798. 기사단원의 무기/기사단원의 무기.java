class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        int[] powers = new int[number+1];

        // 1. 약수 갯수 구하기
        for(int i = 1; i < powers.length; i++){
            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    if(i / j == j){
                        powers[i]++;
                    }
                    else{
                        powers[i] += 2;
                    }
                }
            }
        }

        // 2. powers 요소와 limit 비교하여 초과면 power로 변경
        for(int i=1; i < powers.length; i++){
            if(powers[i] > limit){
                powers[i] = power;
            }
        }

        //3. powers 합 출력
        for(int p : powers){
            answer += p;
        }

        return answer;
    }
}