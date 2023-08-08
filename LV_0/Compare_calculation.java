package LV_0;

public class Compare_calculation{
    public static void main(String args[]){
        System.out.println(new Solution_Compare_calculation().solution(2, 91));
    }
}

class Solution_Compare_calculation {
    public int solution(int a, int b) {
        int answer = 2 * a * b;
        int ans =  Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        if(answer < ans) return ans;
        return answer;
    }
}