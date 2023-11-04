//https://school.programmers.co.kr/learn/courses/30/lessons/12917
package LV_1;

import java.util.Arrays;

public class Reverse_string {
    public static void main(String args[]){
        System.out.println(new Solution_Reverse_string().solution("Zbcdefg"));
    }
}
class Solution_Reverse_string {
    public String solution(String s) {
        char[] chars = s.toCharArray(); 
        Arrays.sort(chars);
        StringBuilder answer = new StringBuilder();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                answer.append(c);
            }
        }
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                answer.append(c);
            }
        }
        return answer.reverse().toString();
    }
}
