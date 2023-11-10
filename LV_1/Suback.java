//https://school.programmers.co.kr/learn/courses/30/lessons/12922

package LV_1;

public class Suback {
    public static void main(String args[]){
        System.out.println(new Solution_Suback().solution(3));
    }
}

class Solution_Suback {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n/2 ; i++)
            answer += "수박";
        if(n % 2 == 1)
            answer += "수";
        return  answer;
    }
}