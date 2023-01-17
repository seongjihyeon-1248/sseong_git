//https://school.programmers.co.kr/learn/courses/30/lessons/147355
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
        //p문자열의 길이를 받음
        int len_p = p.length();  
        //t문자열을 p길이 만큼 앞부터 잘라서 p문자열과 크기 비교하여 작거나 같으면 카운트 증가
        for (int i = 0; i < t.length() - len_p + 1; i++) { 
            if (t.substring(i, i + len_p).compareTo(p) <= 0) 
                answer++;
        }
        return answer;
    }
}