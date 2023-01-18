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
        int del = n - 1;
        int pick = del;
        ArrayList<Integer> Del = new ArrayList<Integer>();
        ArrayList<Integer> Pick = new ArrayList<Integer>();
        
        while(del >= 0 && deliveries[del] == 0)
            del--;
        while(del >= 0){
            Del.add(del);
            for (int i = 0; i < cap; i++){
                deliveries[del] -= 1;
                while(del >= 1 && deliveries[del] == 0)
                    del--;
            }
        }
        
        while(pick >= 0 && pickups[pick] == 0)
            pick--;
        while(pick >= 0){
            Pick.add(pick);
            for (int i = 0; i < cap; i++){
                System.out.print(pick);
                pickups[pick] -= 1;
                while(pick >= 1 && pickups[pick] == 0)
                    pick--;
            }
        }    
        
        return 2 * answer;
    }
}