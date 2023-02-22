import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergencyAsc = Arrays.stream(emergency).sorted().toArray();
        
        for(int index = 0; index < answer.length; index++) {
            for(int ascIndex = 0; ascIndex < emergencyAsc.length; ascIndex++) {
                    if(emergency[index] == emergencyAsc[ascIndex]) {
                        answer[index] = emergencyAsc.length - ascIndex;
                }
            }
        }
        
        return answer;
    }
}