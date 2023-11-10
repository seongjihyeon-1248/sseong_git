//https://school.programmers.co.kr/learn/courses/30/lessons/120910
package LV_0;

public class Virus {
    public static void main(String args[]){
        System.out.println(new Solution_Virus().solution(2, 10));
    }
}

class Solution_Virus {
    public int solution(int n, int t) {
        for (int i = 0; i < t; i++)
            n *= 2;
        return n;
    }
}