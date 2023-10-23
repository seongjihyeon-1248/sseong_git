//https://school.programmers.co.kr/learn/courses/30/lessons/120840
package LV_0;

public class Share{
    public static void main(String args[]){
        System.out.println(new Solution_Share().solution(3, 2));
    }
}
class Solution_Share {
    public long solution(int balls, int share) {
        long answer = 1;
        for (int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
        return answer;
    }
}