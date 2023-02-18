class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        
        numer1 = numer1 * denom2;
        numer2 = numer2 * denom1;
        
        int numer = numer1 + numer2;
        int denom = denom1 * denom2;
        int greatestCommonDivisor = 0;
        
        if(numer > denom) {
            greatestCommonDivisor = euclidean(numer, denom);
        } else {
            greatestCommonDivisor = euclidean(denom, numer);
        }
        
        numer = numer / greatestCommonDivisor;
        denom = denom / greatestCommonDivisor;
        
        answer[0] = numer;
        answer[1] = denom; 
        
        return answer;
    }
    
    public int euclidean(int num1, int num2) {
        if((num1 % num2) == 0) return num2;
        
        return euclidean(num2, num1 % num2);
    }
}