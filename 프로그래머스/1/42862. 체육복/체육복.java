import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 양 옆만 빌려주기 가능
        // reserve, lost 둘 다 포함된 학생은 못빌려줌
        
        boolean[] checked = new boolean[n+1];
        
        boolean[] reserved = new boolean[n+1];
        
        Arrays.fill(checked, true);
        
        // 도난자 확인
        for(int l : lost){
            checked[l] = false;
        }
        
        // 빌려줄 수 있는 사람 확인
        for(int r : reserve){
            reserved[r] = true;
        }
        
        // 빌려주기
        for(int i=1; i<=n; i++){
            if(!checked[i]){
                
                if(reserved[i]){
                    checked[i] = true;
                    reserved[i] = false;
                }
                
                int front = i - 1;
                int back = i + 1;
                
                if(front >= 1 && checked[front] && reserved[front]){
                    checked[i] = true;
                    reserved[front] = false;
                }
                else if(back <= n && checked[back] && reserved[back]){
                    checked[i] = true;
                    reserved[back] = false;
                }
            }
        }
        
        // 체육복 빌려준 학생 수 구하기
        for(int i=1; i<=n; i++){
            if(checked[i])
               answer++;
        }
        
        return answer;
    }
}