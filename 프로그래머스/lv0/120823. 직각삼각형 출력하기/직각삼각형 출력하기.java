import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String answer = "";
        
        for(int height = 1; height <= n; height++) {
            for(int width = n - height ; width < n; width++) {
                answer += "*";
            }
            answer += "\n";
        }
        
        System.out.println(answer);
    }
}