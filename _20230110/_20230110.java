package _20230110;

import java.util.*;

public class _20230110{
    public static void main(String args[]){
        System.out.println(new Solution().solution("3141592","271"));
    }
}
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len_p = p.length();
        for (int i = 0; i < t.length() - len_p + 1; i++) {
            if (t.substring(i, i + len_p).compareTo(p) <= 0) 
                answer++;
        }
        return answer;
    }
}