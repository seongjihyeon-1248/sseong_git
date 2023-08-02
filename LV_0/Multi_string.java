//https://school.programmers.co.kr/learn/courses/30/lessons/181940
package LV_0;

public class Multi_string {
    public static void main(String args[]){
        System.out.println(new Solution_Multi_string().solution("string", 3));
    }
}

class Solution_Multi_string {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for(int i = 0 ; i < k; i++)
            answer.append(my_string);
        return answer.toString();
    }
}