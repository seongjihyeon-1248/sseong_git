//https://school.programmers.co.kr/learn/courses/30/lessons/120845
package LV_0;

public class Dice_num{
    public static void main(String args[]){
        System.out.println(new Solution_Dice_num().solution(new int[]{1, 1, 1}, 1));
    }
}
class Solution_Dice_num {
    public int solution(int[] box, int n) {
        int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
        return answer;
    }
}