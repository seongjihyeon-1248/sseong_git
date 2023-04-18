//https://school.programmers.co.kr/learn/courses/30/lessons/120825

package LV_0;

public class Repeated_text_printing {
    public static void main(String args[]){
        System.out.println(new Solution_Repeated_text_printing().solution("hello", 3));
    }
}

class Solution_Repeated_text_printing {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            for(int ii = 0; ii < n; ii++)
                answer += my_string.charAt(i);
        }
        return answer;
    }
}