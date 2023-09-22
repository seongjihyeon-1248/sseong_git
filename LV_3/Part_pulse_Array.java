package LV_3;

public class Part_pulse_Array {
    public static void main(String args[]){
        System.out.println(new Solution_Part_pulse_Array().solution(new int[]{2, 3, -6, 1, 3, -1, 2, 4}));
    }
}

class Solution_Part_pulse_Array {
    public long solution(int[] sequence) {
        long answer = 0;
        long[] sum = new long[sequence.length + 1];
        for(int i = 1; i < sum.length; i++){
            if(i % 2 == 0)  sum[i] = sum[i - 1] + (long) sequence[i - 1] * -1;
            else            sum[i] = sum[i - 1] + (long) sequence[i - 1];
        }
        answer = max_part(sum);
        return answer;
    }
    public long max_part(long[] sum) {
        long max = sum[0];
        long min = sum[0];
        for(int i = 1; i < sum.length; i++) {
            if(max < sum[i])
                max = sum[i];
            if(min > sum[i])
                min = sum[i];
        }
        return Math.abs(max - min);
    }
}