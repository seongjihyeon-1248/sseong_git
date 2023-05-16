//https://school.programmers.co.kr/learn/courses/30/lessons/181889
package LV_0;

import java.util.Arrays;

public class Up_to_the_nth_element {
    public static void main(String args[]){
        System.out.println(new Solution_Up_to_the_nth_element().solution(new int[]{2, 1, 6}, 1));
    }
}

class Solution_Up_to_the_nth_element {
    public int[] solution(int[] num_list, int n) {
        int[] answer = Arrays.copyOf(num_list, n);
        return answer;
    }
}