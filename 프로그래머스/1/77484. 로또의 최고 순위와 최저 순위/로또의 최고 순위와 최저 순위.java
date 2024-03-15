class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int[] checked = new int[46]; // 1 ~ 45
        
        int count = 0; // 맞은 갯수
        
        for(int l : lottos){
            checked[l]++;
        }
        
        for(int w : win_nums){
            if(checked[w] > 0)
                count++;
        }
        
        int max = checked[0] + count;
        
        int min = count;
        
        int[] answer = {returnRank(max), returnRank(min)};
        
        return answer;
    }
    
    public int returnRank(int x){
        switch(x){
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : return 6;
        }
    }
}