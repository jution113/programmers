class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int index = 0; index < strlist.length; index++) {
            answer[index] = strlist[index].length();
        }
        
        return answer;
    }
}