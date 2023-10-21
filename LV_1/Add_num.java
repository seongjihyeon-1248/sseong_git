//https://school.programmers.co.kr/learn/courses/30/lessons/12931
package LV_1;

public class Add_num {
    public static void main(String args[]){
        System.out.println(new Solution_Add_num().solution(123));
    }
}

class Solution_Add_num{
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}