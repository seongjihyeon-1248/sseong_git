//https://school.programmers.co.kr/learn/courses/30/lessons/172927
package LV_2;

import java.util.ArrayList;
import java.util.Collections;

public class Mining_for_minerals {
    public static void main(String args[]){
        System.out.println(new Solution_Mining_for_minerals().solution(new int[]{1, 3, 2}, new String[]{"diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"}));
    }
}
class Solution_Mining_for_minerals {
    public int solution(int[] picks, String[] minerals) {
        int answer = 0;
        int pick = picks[0] + picks[1] + picks[2];
        ArrayList<Integer> dia = new ArrayList<Integer>();
        ArrayList<Integer> iron = new ArrayList<Integer>();
        ArrayList<Integer> stone = new ArrayList<Integer>();
        for(int i = 0; i < minerals.length / 5; i++){
            if(i >= pick) break;
            int ir = 0;
            int st = 0;
            for(int ii = i * 5; ii < i * 5 + 5; ii++){
                if(minerals[ii].equals("diamond")){
                    ir += 5;
                    st += 25;
                }
                else if(minerals[ii].equals("iron")){
                    ir++;
                    st += 5;
                }
                else{
                    ir++;
                    st++;
                }
            }
            dia.add(5);
            iron.add(ir);
            stone.add(st);
        }
        int ir = 0;
        int st = 0;
        if(iron.size() < pick){
            for(int ii = (minerals.length / 5) * 5; ii < minerals.length; ii++){
                if(minerals[ii].equals("diamond")){
                    ir += 5;
                    st += 25;
                }
                else if(minerals[ii].equals("iron")){
                    ir++;
                    st += 5;
                }
                else{
                    ir++;
                    st++;
                }
            }
            dia.add(minerals.length - (minerals.length / 5) * 5);
            iron.add(ir);
            stone.add(st);  
        } 
        for(int i = 0; i< picks[0]; i++){
            if(stone.size() == 0) break;
            int max_index = stone.indexOf(Collections.max(stone));
            answer += dia.get(max_index);
            dia.remove(max_index);
            iron.remove(max_index);
            stone.remove(max_index);
        }
        for(int i = 0; i< picks[1]; i++){
            if(stone.size() == 0) break;
            int max_index = stone.indexOf(Collections.max(stone));
            answer += iron.get(max_index);
            iron.remove(max_index);
            stone.remove(max_index);
        }
        for(int i : stone){
            answer += i;
        }
        return answer;
    }
}