class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        boolean[] checked = new boolean[goal.length];
        
        int idx1 = 0, idx2 = 0, i=0;
        
        int c1 = cards1.length, c2 = cards2.length;
        
        for(String g : goal){
            if(idx1 < c1 && g.equals(cards1[idx1])){
                checked[i] = true;
                idx1++;
            }
            else if(idx2 < c2 && g.equals(cards2[idx2])){
                checked[i] = true;
                idx2++;
            }
            else{
                idx1++;
                idx2++;
            }
            
            i++;
        }
        
        for(boolean b : checked){
            if(!b)
                answer = "No";
        }
        
        return answer;
    }
}