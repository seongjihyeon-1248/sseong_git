package LV_1;

public class Reverse_integer {
    public static void main(String args[]){
        System.out.println(new Solution_Reverse_integer().solution(800000000));
    }
}

class Solution_Reverse_integer {
    int[] N;
    public long solution(long n) {
        long answer = 0;
        N = new int[10];
        while(n > 0){
            N[(int)(n%10)] += 1;
            n /= 10L;
        }
        for(int i = 9; i >= 0; i--){
            for(int ii = 0; ii < N[i]; ii++){
                answer *= 10;
                answer += i;
            }
        }
        return answer;
    }
}