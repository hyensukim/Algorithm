class Solution {
    public int[] solution(int n, int m) {
        
        int i = gcd(m,n); // 최대 공약수
        int j = (n * m)/i; // 최소 공배수
        
        int[] answer = {i,j};
        
        return answer;
    }
    
    public int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b,a%b);
    }
}