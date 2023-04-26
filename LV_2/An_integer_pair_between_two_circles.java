//https://school.programmers.co.kr/learn/courses/30/lessons/181187
package LV_2;

public class An_integer_pair_between_two_circles {
    public static void main(String args[]){
        System.out.println(new Solution_An_integer_pair_between_two_circles().solution(2,3));
    }
}

class Solution_An_integer_pair_between_two_circles{
    public long solution(int r1, int r2) {
        long answer = 0;
        for(int i = 0; i < r1; i++){
            answer += (int)Math.floor((Math.sqrt(1.0 * r2 * r2 - 1.0 * i * i))) - Math.ceil(Math.sqrt((1.0 * r1 * r1 - 1.0 * i * i))) + 1;
        }
        for(int i = r1; i < r2; i++){
            answer += (int)Math.floor((Math.sqrt(1.0 * r2 * r2 - 1.0 * i * i)));
        }
        return answer * 4;
    }
}