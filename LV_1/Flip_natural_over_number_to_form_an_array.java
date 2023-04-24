//https://school.programmers.co.kr/learn/courses/30/lessons/12932
package LV_1;

import java.util.*;

public class Flip_natural_over_number_to_form_an_array {
    public static void main(String args[]){
        System.out.println(new Solution_Flip_natural_over_number_to_form_an_array().solution(12345));
    }
}

class Solution_Flip_natural_over_number_to_form_an_array {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> answer = new ArrayList<>();
        while(n > 0){
            answer.add((int)(n % 10));
            n /= 10;
        }
        return answer;
    }
}