//https://school.programmers.co.kr/learn/courses/30/lessons/181188
package LV_2;

import java.util.*;

class An_interception_system{
    public static void main(String args[]){
        System.out.println(new Solution_An_interception_system().solution(new int[][]{{4, 5}, {4, 8}, {10, 14}, {11, 13}, {5, 12}, {3, 7}, {1, 4}}));
    }
}

class Solution_An_interception_system{
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets, (o1, o2) -> { return o1[1]-o2[1]; });
        int last = -1;
        for (int[] target : targets) {
            if (last > target[0] && last <= target[1]) continue;            
            answer++;
            last = target[1];
        }
        
        return answer;
    }
}