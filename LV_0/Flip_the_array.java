//https://school.programmers.co.kr/learn/courses/30/lessons/120821
package LV_0;

public class Flip_the_array {
    public static void main(String args[]){
        System.out.println(new Solution_Flip_the_array().solution(new int[]{1, 2, 3, 4, 5}));
    }
}

class Solution_Flip_the_array {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length - i -1];
        }
        return answer;
    }
}