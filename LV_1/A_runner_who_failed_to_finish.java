//https://school.programmers.co.kr/learn/courses/30/lessons/42576
package LV_1;

import java.util.HashMap;
import java.util.Map;

public class A_runner_who_failed_to_finish {
    public static void main(String args[]){
        System.out.println(new Solution_A_runner_who_failed_to_finish().solution(new String[]{"One", "Two", "Three"}, new String[]{"eden", "kiki"})); 
    }
}

class Solution_A_runner_who_failed_to_finish {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
    
        Map<String, Integer> hm = new HashMap<>();
        
        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0)+1);
        }
    
        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }
    
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }
    
        return answer;
    }
}