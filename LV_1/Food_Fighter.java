//https://school.programmers.co.kr/learn/courses/30/lessons/134240
package LV_1;

public class Food_Fighter {
    public static void main(String args[]){
        System.out.println(new Solution_Food_Fighter().solution(new int[]{1, 3, 4, 6}));
    }
}

class Solution_Food_Fighter {
    public String solution(int[] food) {
        StringBuilder player1 = new StringBuilder();
        StringBuilder player2 = new StringBuilder();

        for(int i = 1; i < food.length; i++) {
            int end = food[i] / 2;
            for(int j = 0; j < end; j++) {
                player1.append(i); 
            }
        }
        player2.append(player1);
        return (player1.append("0").append(player2.reverse())).toString();
    }
}