//https://school.programmers.co.kr/learn/courses/30/lessons/132265
package LV_2;

import java.util.*;

public class Cut_the_roll_cake{
    public static void main(String args[]){
        System.out.println(new Solution_Cut_the_roll_cake().solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }
}

class Solution_Cut_the_roll_cake {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> sub = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> main = new HashMap<Integer, Integer>();

        //main에 topping 정리
        for (int i : topping) {
            int cnt = 1;
            if (main.containsKey(i)) {
                cnt = main.get(i) + 1;
                main.remove(i);
            }
            main.put(i, cnt);
        }

        //topping을 순서대로 꺼내
        for (int i : topping) {
            int cnt = 1;
            //sub에 추가
            if (sub.containsKey(i)) {
                cnt = sub.get(i) + 1;
                sub.remove(i);
            }
            sub.put(i, cnt);
            //main에서 제거
            if (main.containsKey(i)) {
                cnt = main.get(i) - 1;
                main.remove(i);
                if (cnt > 0) {
                    main.put(i, cnt);
                }
            }
            //sub와 main의 종류 개수 비교 후 같으면 카운트
            if (sub.size() == main.size()) {
                answer++;
            }
        }
        return answer;
    }
}