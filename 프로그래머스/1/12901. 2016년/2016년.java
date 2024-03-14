import java.time.*;
import java.time.format.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        LocalDateTime dateTime = LocalDateTime.of(2016,a,b,12,0);
        
        String dayOfWeek = dateTime.format(DateTimeFormatter.ofPattern("E"));

        answer = dayOfWeek.toUpperCase();
        
        return answer;
    }
}