//https://school.programmers.co.kr/learn/courses/30/lessons/12916
package LV_1;

public class Num_p_and_y_in_string {
    public static void main(String args[]){
        System.out.print(new Solution_Num_p_and_y_in_string().solution("Pyy"));
    }
}

class Solution_Num_p_and_y_in_string {
    boolean solution(String s) {
        int p_count = 0;
        int y_count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p')
                p_count++;
            if(s.charAt(i) == 'Y' || s.charAt(i) == 'y')
                y_count++;
        }
        if(p_count == y_count)
            return true;
        else
            return false;
    }
}