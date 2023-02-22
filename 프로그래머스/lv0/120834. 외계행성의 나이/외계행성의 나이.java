class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        String answer = "";
        
        final int ascSmallCaseStartDigits = 97;
        
        for(int ageIndex = 0; ageIndex < strAge.length(); ageIndex++) {
            int ageDigits = Character.getNumericValue(strAge.charAt(ageIndex));
            char numToAlphabet = (char) (ascSmallCaseStartDigits + ageDigits);
            answer += String.valueOf(numToAlphabet);
        }
        
        return answer;
    }
}