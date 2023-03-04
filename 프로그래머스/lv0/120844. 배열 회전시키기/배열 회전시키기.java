class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        boolean isRight = direction.equals("right");
        int moveIdx = isRight ? -1 : 1;
        
        for(int i = 1; i < numbers.length - 1; i++) {
            answer[i] = numbers[i + moveIdx];
        }
        
        answer[0] = isRight ? numbers[numbers.length - 1] : numbers[1];
        answer[numbers.length - 1] = isRight ? numbers[numbers.length - 2] : numbers[0];
        
        return answer;
    }
}