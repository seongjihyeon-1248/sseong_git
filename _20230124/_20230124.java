//https://school.programmers.co.kr/learn/courses/30/lessons/17682

package _20230124;

public class _20230124{
    public static void main(String args[]){
        System.out.println(new Solution().solution("1S2D*3T"));
    }
}
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        for(int i = 0; i < dartResult.length(); i++){
            System.out.println(dartResult.substring(i, i + 1));
        }
        return answer;
    }
}