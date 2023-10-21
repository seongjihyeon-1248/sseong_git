//https://school.programmers.co.kr/learn/courses/30/lessons/181936
package LV_0;

public class Common_multiple{
    public static void main(String args[]){
        System.out.println(new Solution_Common_multiple().solution(60, 2, 3));
    }
}
class Solution_Common_multiple {
    public int solution(int number, int n, int m) {
        if(number % n == 0 && number % m == 0)
            return 1;
        return 0;
    }
}