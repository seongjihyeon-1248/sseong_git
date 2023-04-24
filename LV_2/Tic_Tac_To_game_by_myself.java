//https://school.programmers.co.kr/learn/courses/30/lessons/160585
package LV_2;

public class Tic_Tac_To_game_by_myself{
    public static void main(String args[]){
        System.out.print(new Solution_Tic_Tac_To_game_by_myself().solution(new String[]{"OXO", "O.O", "XXX"}));
    }
}

class Solution_Tic_Tac_To_game_by_myself {
    public int solution(String[] board) {
        int o_num = 0;
        int x_num = 0;
        String ox = ".";
        //X가 O보다 먼저 두거나 O가 본인 차례에 더 많이 두었을 경우
        for(String i : board){
            for(int ii = 0; ii < 3; ii++){
                if((i.substring(ii, ii+1)).equals("O"))
                    o_num++;
                else if((i.substring(ii, ii+1)).equals("X"))
                    x_num++;
            }
        }
        if(o_num < x_num || o_num > x_num + 1)
            return 0;
        if(o_num > 2){
            //O차례에서 끝났는데 X가 진행했을 경우
            if(o_num == x_num) ox = "O";
            //X차례에서 끝났는데 O가 진행했을 경우
            else ox = "X";
            //가로 빙고
            for(String i : board){
                if((i.substring(0, 1)).equals(ox) && (i.substring(1, 2)).equals(ox) && (i.substring(2)).equals(ox))
                    return 0;
            }
            //세로 빙고
            for(int i = 0; i < 3; i++){
                if(board[0].substring(i, i+1).equals(ox) && board[1].substring(i, i+1).equals(ox) && board[2].substring(i, i+1).equals(ox))
                    return 0;
            }
            //대각선 빙고
            if(board[1].substring(1, 2).equals(ox)){
                if(board[0].substring(0, 1).equals(ox) && board[2].substring(2).equals(ox))
                    return 0;
                if(board[2].substring(0, 1).equals(ox) && board[0].substring(2).equals(ox))
                    return 0;
            }
        }
        return 1;
    }
}