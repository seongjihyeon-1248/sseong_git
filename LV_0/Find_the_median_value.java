//https://school.programmers.co.kr/learn/courses/30/lessons/120811#
package LV_0;

import java.util.*;

public class Find_the_median_value{
    public static void main(String args[]){
        System.out.println(new Solution_Find_the_median_value().solution(new int[]{1, 2, 7, 10, 11}));
    }
}
class Solution_Find_the_median_value {
    public int solution(int[] array) {
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        for(int i : array)
            Arr.add(i);
        Collections.sort(Arr);
        return Arr.get(Arr.size() / 2);
    }
}