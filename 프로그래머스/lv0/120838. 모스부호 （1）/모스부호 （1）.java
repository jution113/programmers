class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] words = letter.split(" ");
        final String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        for(String word : words) {
            for(int morseIndex = 0; morseIndex < morseCode.length; morseIndex++) {
                if(word.equals(morseCode[morseIndex])) {
                    answer += (char) (97 + morseIndex);
                }
            }
        }
        
        return answer;
    }
}