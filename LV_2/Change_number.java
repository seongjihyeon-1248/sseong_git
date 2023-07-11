//https://school.programmers.co.kr/learn/courses/30/lessons/154538
package LV_2;

public class Change_number {
    public static void main(String args[]){
        System.out.println(new Solution_Change_number().solution(10, 1000000, 5));
    }
}

class Solution_Change_number {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        for (int i = x; i < y + 1; i++) {
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }
            if (i * 2 <= y) {
                dp[i * 2] = (dp[i * 2] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }
            if (i * 3 <= y) {
                dp[i * 3] = (dp[i * 3] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }
            if (i + n <= y) {
                dp[i + n] = (dp[i + n] == 0) ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
        }
        return dp[y];
    }
}