import java.util.*;

class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        final int diceWidthCount = box[0] / n;
        final int diceDepthCount = box[1] / n;
        final int diceHeightCount = box[2] / n;
        answer = diceWidthCount * diceDepthCount * diceHeightCount;
        
        return answer;
    }
}