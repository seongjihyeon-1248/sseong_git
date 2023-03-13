//https://school.programmers.co.kr/learn/courses/30/lessons/120889
package LV_0;

public class The_completion_of_a_triangle{
    public static void main(String args[]){
        System.out.println(new Solution_The_completion_of_a_triangle().solution(new int[]{199, 72, 222}));
    }
}
class Solution_The_completion_of_a_triangle {
    public int solution(int[] sides) {
        if(sides[0] < sides[1]){
            if(sides[1] < sides[2]){
                if(sides[0] + sides[1] > sides[2]) 
                    return 1;
            }
            else{
                if(sides[0] + sides[2] > sides[1]) 
                    return 1;
            }
        }
        else{
            if(sides[0] < sides[2]){
                if(sides[0] + sides[1] > sides[2]) 
                    return 1;
            }
            else{
                if(sides[1] + sides[2] > sides[0]) 
                    return 1;
            }
        }
        return 2;
    }
}