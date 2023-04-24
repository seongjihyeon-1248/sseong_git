//https://school.programmers.co.kr/learn/courses/30/lessons/1845
package LV_1;

import java.util.ArrayList;

class Pockenmon{
    public static void main(String args[]){
        System.out.println(new Solution_Pockenmon().solution(new int[]{3,1,2,3}));
    }
}

class Solution_Pockenmon {
    public int solution(int[] nums) {
        int answer = nums.length / 2;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i : nums){
            if(!a.contains(i))
                a.add(i);
        }
        return (answer > a.size()) ? a.size() : answer;
    }
}