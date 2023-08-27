//https://school.programmers.co.kr/learn/courses/30/lessons/176963
package LV_1;

import java.util.Arrays;

public class Memory_score {
    public static void main(String args[]){
        System.out.println(new Solution_Memory_score().solution(
                                new String[]{"may", "kein", "kain", "radi"}, 
                                new int[]{5, 10, 1, 3}, 
                                new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}}));
    }
}

class Solution_Memory_score {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < name.length; j++){
                if(Arrays.asList(photo[i]).indexOf(name[j]) != -1){
                    answer[i] += yearning[j];
                }
            }
        }
        return answer;
    }
}