class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(String babblingWord : babbling) {
            int babblingWordLength = babblingWord.length();
            int totalWordLength = 0;
            
            for(String word : words) {
                if(babblingWord.contains(word)) totalWordLength += word.length();
            }
            if(babblingWordLength == totalWordLength) answer += 1;
        }
        
        return answer;
    }
}