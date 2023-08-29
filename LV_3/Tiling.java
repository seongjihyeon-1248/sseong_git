package LV_3;

public class Tiling{
    public static void main(String args[]){
        System.out.println(new Solution_Tiling().solution(2));
    }
}

class Solution_Tiling {
    int[] N;
    public int solution(int n) {
        int answer = 0;
        N = new int[4];
        N[1] = 1;
        N[2] = 2;
        N[3] = 9;
        return answer;
    }
}