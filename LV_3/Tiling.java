//https://school.programmers.co.kr/learn/courses/30/lessons/181186
package LV_3;

public class Tiling{
    public static void main(String args[]){
        System.out.println(new Solution_Tiling().solution(5));
    }
}
class Solution_Tiling {
    public long solution(int n){
        long answer = 0;
        long[] dp = new long[100001];
        long[] cache = new long[]{8, 0, 2};
        int MOD = 1000000007;
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 10;
        int temp = 0;
        for(int i = 4; i <= n; i++){
            int cur = i % 3;
            temp = cur == 0 ? 4 : 2;
            dp[i] = (dp[i-1] + dp[i-2] * 2 + dp[i-3] * 5 + temp + cache[cur]) % MOD;

            cache[cur] += dp[i-1] * 2;
            cache[cur] += dp[i-2] * 2;
            cache[cur] += dp[i-3] * 4;
            cache[cur] %= MOD;
        }
        answer = dp[n];
        return answer;
    }
}