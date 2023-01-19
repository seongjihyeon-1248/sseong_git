//https://school.programmers.co.kr/learn/courses/30/lessons/150369

package _20230117;

import java.util.*;

public class _20230117{
    public static void main(String args[]){
        System.out.println(new Solution().solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0}));
    }
}
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0, min, max;
        ArrayList<Integer> Del = new ArrayList<Integer>();
        ArrayList<Integer> Pick = new ArrayList<Integer>();
        for(int i = n - 1; i >= 0; i--){
            for(int ii = 0; ii < deliveries[i]; ii++)
                Del.add(i);
        }
        for(int i = n - 1; i >= 0; i--){
            for(int ii = 0; ii < pickups[i]; ii++)
                Pick.add(i);
        }

        int a;
        if(Del.size() < Pick.size()){
            for(a = 0; a < Del.size(); a+=cap)
                answer += (Del.get(a) > Pick.get(a)) ? Del.get(a) : Pick.get(a);
            for(; a < Pick.size(); a+=cap)   
                answer += Pick.get(a);
        }
        else{
            for(a = 0; a < Pick.size(); a+=cap)
                answer += (Del.get(a) > Pick.get(a)) ? Del.get(a) : Pick.get(a);
            for(; a < Del.size(); a+=cap)   
                answer += Del.get(a);
        }
        return 2 * (answer + a / cap);
    }
}