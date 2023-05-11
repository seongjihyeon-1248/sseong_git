package LV_0;

import java.util.stream.IntStream;

public class Countdown {
    public static void main(String args[]){
        System.out.println(new Solution_Countdown().solution(10, 3));
    }
}

class Solution_Countdown {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
    }
}