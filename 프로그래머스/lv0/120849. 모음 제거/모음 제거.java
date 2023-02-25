class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        final String[] vowels = {"a", "e", "i", "o", "u"};
        
        for(String vowel : vowels) {
            answer = answer.replaceAll(vowel, "");
        }
        
        return answer;
    }
}