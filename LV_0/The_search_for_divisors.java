//https://school.programmers.co.kr/learn/courses/30/lessons/120897
package LV_0;

import java.util.ArrayList;
import java.util.Collections;

public class The_search_for_divisors{
    public static void main(String args[]){
        System.out.println(new Solution_The_search_for_divisors().solution(24));
    }
}

class Solution_The_search_for_divisors {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 1; i < Math.sqrt(n); i++){
            if(n % i == 0){
                answer.add(i);
                answer.add(n / i);
            }
        }
        if(n % Math.sqrt(n) == 0)
            answer.add((int)Math.sqrt(n));
        Collections.sort(answer);
        return answer;
    }
}