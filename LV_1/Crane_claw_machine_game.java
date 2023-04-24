//https://school.programmers.co.kr/learn/courses/30/lessons/64061
package LV_1;

public class Crane_claw_machine_game {
    public static void main(String args[]){
        System.out.println(new Solution_Crane_claw_machine_game().solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }
}

class Solution_Crane_claw_machine_game {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] b = new int[board.length];
        int[] basket = new int[moves.length];
        int bas = -1;
        for(int i = 0; i < board.length; i++){
            b[i] = board.length;
            for(int ii = 0; ii < board.length; ii++){
                if(board[ii][i] != 0){
                    b[i] = ii;
                    break;
                }
            }
        }
        for(int i = 0; i < moves.length; i++){
            if(b[moves[i] - 1] < board.length){
                int move = board[b[moves[i] - 1]][moves[i] - 1];
                if(bas >= 0 && move == basket[bas]){
                    bas--;
                    answer+=2;
                }
                else{
                    basket[++bas] = move;
                }
                b[moves[i] - 1] += 1;
            }
        }
        return answer;
    }
}