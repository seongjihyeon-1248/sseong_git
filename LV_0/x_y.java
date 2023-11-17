//https://school.programmers.co.kr/learn/courses/30/lessons/120861
package LV_0;

public class x_y {
    public static void main(String args[]){
        System.out.println(new Solution_x_y().solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11}));
    }
}

class Solution_x_y {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        for(String key: keyinput){
            switch (key) {
                case "left":
                    if(-x < board[0] / 2)  x--;  
                    break;
            
                case "right":
                    if(x < board[0] / 2)  x++; 
                    break;

                case "up":
                    if(y < board[1] / 2)  y++; 
                    break;

                case "down":
                    if(-y < board[1] / 2)  y--; 
                    break;
                
                default:
                    break;
            }
        }
        int[] answer = new int[]{x, y};
        return answer;
    }
}