import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        if(array.length == 1) {
            answer = array[0];
            return answer;
        }
        
        int[] uniqueNumbers = Arrays.stream(array).distinct().toArray();
        int[] numberFrequency = new int[uniqueNumbers.length];
        int maxFrequencyNumber = uniqueNumbers[0];
        int maxFrequency = 1;
        int maxFrequencyCount = 0;
        
        for(int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            for(int uniqueNumbersIndex = 0; uniqueNumbersIndex < uniqueNumbers.length; uniqueNumbersIndex++) {
                if(array[arrayIndex] == uniqueNumbers[uniqueNumbersIndex]) {
                    numberFrequency[uniqueNumbersIndex]++;
                    if(numberFrequency[uniqueNumbersIndex] > maxFrequency) {
                        maxFrequencyNumber = uniqueNumbers[uniqueNumbersIndex];
                        maxFrequency = numberFrequency[uniqueNumbersIndex];
                    }
                }
            }
        }
        
        for(int uniqueNumbersIndex = 0; uniqueNumbersIndex < uniqueNumbers.length; uniqueNumbersIndex++) {
            if(maxFrequency == numberFrequency[uniqueNumbersIndex]) maxFrequencyCount++;
        }
        
        if(maxFrequencyCount > 1) {
            answer = -1;
        } else {
            answer = maxFrequencyNumber;
        }
        
        return answer;
    }
}