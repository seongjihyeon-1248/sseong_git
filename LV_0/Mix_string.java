//https://school.programmers.co.kr/learn/courses/30/lessons/181942
package LV_0;

public class Mix_string {
    public static void main(String args[]){
        System.out.print(new Solution_Mix_string().solution("aaaaa", "bbbbb"));
    }
}

class Solution_Mix_string {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i < str1.length(); i++)
            answer += str1.substring(i, i + 1) + str2.substring(i, i + 1);
        return answer;
    }
}