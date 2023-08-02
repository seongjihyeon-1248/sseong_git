//https://school.programmers.co.kr/learn/courses/30/lessons/181943
package LV_0;

public class Overwriting {
    public static void main(String args[]){
        System.out.print(new Solution_Overwriting().solution("He11oWor1d", "lloWorl", 2));
    }
}

class Solution_Overwriting {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length());
        return answer;
    }
}