class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String sumCase1 = "";
        String sumCase2 = "";
        sumCase1 = sumCase1 + a + b;
        sumCase2 = sumCase2 + b + a;
        answer = (Integer.parseInt(sumCase1) >= Integer.parseInt(sumCase2)) ? Integer.parseInt(sumCase1) : Integer.parseInt(sumCase2);
        
        return answer;
    }
}