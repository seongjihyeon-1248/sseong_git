//https://school.programmers.co.kr/learn/courses/30/lessons/169198
package LV_2;

public class Billiard_practice{
    public static void main(String args[]){
        System.out.println(new Solution_Billiard_practice().solution(10,10,5,5, new int[][]{{4, 5}, {6, 5}, {5, 4}, {5, 6}}));
    }
}

class Solution_Billiard_practice{
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = {};
        answer = new int[balls.length];
        int a, b;
        m *= 2;
        n *= 2;
        for(int i = 0; i < balls.length; i++){
            if(startX  + balls[i][0] > (m / 2) && !((startY == balls[i][1]) && (startX < balls[i][0])) || ((startY == balls[i][1]) && (startX > balls[i][0])))
                a = (startX  + balls[i][0] - m) * (startX  + balls[i][0] - m) + (startY - balls[i][1]) * (startY - balls[i][1]);
            else
                a = (startX  + balls[i][0]) * (startX  + balls[i][0]) + (startY - balls[i][1]) * (startY - balls[i][1]);
            if(startY + balls[i][1] > (n / 2) && !((startX == balls[i][0]) && (startY < balls[i][1])) || ((startX == balls[i][0]) && (startY > balls[i][1])))
                b = (startX  - balls[i][0]) * (startX  - balls[i][0]) + (startY + balls[i][1] - n) * (startY + balls[i][1] - n);
            else
                b = (startX  - balls[i][0]) * (startX  - balls[i][0]) + (startY + balls[i][1]) * (startY + balls[i][1]); 
            if(a < b)
                answer[i] = a;
            else
                answer[i] = b;
        }
        for(int i = 0; i < balls.length; i++)
            System.out.println(answer[i]);
        return answer;
    }
}