///https://school.programmers.co.kr/learn/courses/30/lessons/176962
package LV_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Proceeding_with_the_assignment{
    public static void main(String args[]){
        System.out.println(new Solution_Proceeding_with_the_assignment().solution(new String[][]{{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}}));
    }
}

class Solution_Proceeding_with_the_assignment{
    public String[] solution(String[][] plans) {
        String[] answer = new String[plans.length];
        int ans = 0;
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        for(int i = 0; i < plans.length; i++)
            a.put(Integer.parseInt(plans[i][1].substring(0,2)) * 60 + Integer.parseInt(plans[i][1].substring(3)), i);

        List<Integer> keySet = new ArrayList<>(a.keySet());
        Collections.sort(keySet);
    
        for(int i = 1; i < keySet.size(); i++)
		{
            int time = keySet.get(i - 1);
            while(i > 0){
                time += Integer.parseInt(plans[a.get(keySet.get(i-1))][2]);
                plans[a.get(keySet.get(i - 1))][2] = "" + (time - keySet.get(i));
                if(Integer.parseInt(plans[a.get(keySet.get(i - 1))][2]) <= 0){
                    answer[ans++] = plans[a.get(keySet.get(i - 1))][0];
                    keySet.remove(i - 1);
                    i--;
                }
                else break;
            }
		}
        Collections.sort(keySet, Collections.reverseOrder());
        for(Integer i : keySet)
            answer[ans++] = plans[a.get(i)][0];
        return answer;
    }
}