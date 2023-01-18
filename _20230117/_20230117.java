//https://school.programmers.co.kr/learn/courses/30/lessons/150369

package _20230117;

import java.util.*;

public class _20230117{
    public static void main(String args[]){
        System.out.println(new Solution().solution(2, 7, new int[]{1, 0, 2, 0, 1, 0, 2}, new int[]{0, 2, 0, 1, 0, 2, 0}));
    }
}
class Solution {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = 0;
        int c = cap;
        int del = n - 1;
        int pick = del;
        while(del >= 0 && deliveries[del] == 0)
            del--;
        while(pick >= 0 && pickups[pick] == 0)
            pick--;
        
        while(del >= 0 || pick >= 0){
            answer += (del > pick) ? del + 1 : pick + 1;
            while(del >= 0 && c > 0){
                deliveries[del] -= 1;
                c--;
                while(del >= 0 && deliveries[del] == 0)
                    del--;
            }
            while(pick >= 0 && c < cap){
                pickups[pick] -= 1;
                c++;
                while(pick >= 0 && pickups[pick] == 0)
                    pick--;
            }
        }
        
        return 2 * answer;
    }
}