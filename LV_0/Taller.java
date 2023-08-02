package LV_0;

public class Taller {
    public static void main(String args[]){
        System.out.println(new Solution_Taller().solution(new int[]{149, 180, 192, 170}, 167));
    }
}

class Solution_Taller {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int i : array)
            if(height < i) 
                answer++;
        return answer;
    }
}