//https://school.programmers.co.kr/learn/courses/30/lessons/181916
package LV_0;

import java.util.Arrays;

public class Dice_game{
    public static void main(String args[]){
        System.out.println(new Solution_Dice_game().solution(2, 2, 2, 2));
    }
}
class Solution_Dice_game {
    int dice[];
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        dice = new int[4];
        dice[0] = a;
        dice[1] = b;
        dice[2] = c;
        dice[3] = d;
        Arrays.sort(dice);
    
        if(dice[0] == dice[1]){
            if(dice[1] == dice[3]){
                return dice[0] * 1111; // a=b=c=d
            }
            else{
                if(dice[1] == dice[2]){
                    return (10 * dice[0] + dice[3]) * (10 * dice[0] + dice[3]); // a=b=c
                }
                else{
                    if(dice[2] == dice[3]){
                        return (dice[0] + dice[2]) * (dice[2] - dice[0]); // a=b c=d
                    }
                    else{
                        return dice[2] * dice[3]; // a=b 
                    }
                }
            }
        }
        else{
            if(dice[1] == dice[3]){
                return dice[1] * 1111; // b=c=d
            }
            else{
                if(dice[1] == dice[2]){
                    return dice[0] * dice[3]; // b=c
                }
                else{
                    if(dice[2] == dice[3]){
                        return dice[0] * dice[1]; // c=d
                    }
                    else{
                        return dice[0]; // a=b 
                    }
                }
            }
        }
    }
}