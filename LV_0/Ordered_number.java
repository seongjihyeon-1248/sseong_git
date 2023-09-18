package LV_0;

public class Ordered_number {
    public static void main(String args[]){
        System.out.println(new Solution_Ordered_number().solution(100));
    }
}

class Solution_Ordered_number {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < Math.sqrt(n); i++)
            if(n % i == 0)
                answer++;
        answer *= 2;
        if(n % Math.sqrt(n) == 0)
            answer++;        
        return answer;
    }
}