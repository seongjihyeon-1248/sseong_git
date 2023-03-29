//https://school.programmers.co.kr/learn/courses/30/lessons/17682
package LV_1;

import java.util.*;

public class Array_of_divisible_numbers{
    public static void main(String args[]){
        System.out.println(new Solution_Array_of_divisible_numbers().solution(new int[]{5, 9, 7, 10}, 5));
    }
}

class Solution_Array_of_divisible_numbers {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(Integer i : arr){
            if(i % divisor == 0)
                answer.add(i);
        }
        if (answer.size() == 0)
            answer.add(-1);
        else
            Collections.sort(answer);
        return answer;
    }
}