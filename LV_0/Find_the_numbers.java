//https://school.programmers.co.kr/learn/courses/30/lessons/120904
package LV_0;

public class Find_the_numbers{
    public static void main(String args[]){
        System.out.println(new Solution_Find_the_numbers().solution(232443, 4));
    }
}
class Solution_Find_the_numbers {
    public int solution(int num, int k) {
        int answer = -1;
        int i = 0;
        while(num != 0){
            if(num % 10 == k)
                answer = i;
            num /= 10;
            i++;
        }
        if(answer == -1) return -1;
        return i - answer;
    }
}