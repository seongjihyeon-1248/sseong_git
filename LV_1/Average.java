package LV_1;

public class Average {
    public static void main(String args[]){
        System.out.println(new Solution_Average().solution(new int[]{1,2,3,4}));
    }
}

class Solution_Average {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i: arr) answer += i;
        return answer / arr.length;
    }
}