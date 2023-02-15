class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int lastNumber = common[common.length - 1];
        int firstGap = common[1] - common[0];
        int secondGap = common[2] - common[1];
        
        boolean isGeometricSequence = firstGap == secondGap;
        int gap = 0; 
            
        if(isGeometricSequence) {
            gap = firstGap;
            answer = lastNumber + gap;
        } else {
            gap = secondGap / firstGap;
            answer = lastNumber * gap;
        }
        
        return answer;
    }
}