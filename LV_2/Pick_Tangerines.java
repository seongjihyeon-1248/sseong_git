//https://school.programmers.co.kr/learn/courses/30/lessons/138476
package LV_2;

import java.util.*;

public class Pick_Tangerines{
    public static void main(String args[]){
        System.out.println(new Solution_Pick_Tangerines().solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
    }
}

class Solution_Pick_Tangerines {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        ArrayList<Integer> tan = new ArrayList<Integer>();
        ArrayList<Integer> freq = new ArrayList<Integer>();
        for(int i : tangerine){
            if(tan.contains(i)){
                int index = tan.indexOf(i);
                freq.set(index, freq.get(index) + 1);
            }
            else { 
                tan.add(i);
                freq.add(1);
            }
        }
        Collections.sort(freq, Collections.reverseOrder());
        for(int i : freq){
            k -= i;
            answer ++;
            if(k <= 0)
                break;
        }
        return answer;
    }
}