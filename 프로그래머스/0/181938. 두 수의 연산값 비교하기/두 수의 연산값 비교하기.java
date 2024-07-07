class Solution {
    public int solution(int a, int b) {
        
        String sum = "" + a + b;
        int case1 = Integer.parseInt(sum);
        
        int case2 = 2 * a * b;
        
        return (case1 >= case2) ? case1 : case2;
    }
}