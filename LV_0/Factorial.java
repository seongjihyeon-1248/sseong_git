package LV_0;

public class Factorial {
    public static void main(String args[]){
        System.out.println(new Solution_Factorial().solution(7));
    }
}

class Solution_Factorial {
    public int solution(int n) {
        int answer = 2;
        while (n >= 1){
            n /= answer++;
        }
        return (answer-2);
    }
}