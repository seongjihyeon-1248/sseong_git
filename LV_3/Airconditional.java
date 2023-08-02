//https://school.programmers.co.kr/learn/courses/30/lessons/214289
package LV_3;

import java.util.ArrayList;

public class Airconditional {
    public static void main(String args[]){
        System.out.println(new Solution_Airconditional().solution(11, 8, 10, 10, 100, new int[]{0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1}));
    }
}

class Solution_Airconditional {
    ArrayList<Integer> list;
    public int solution(int temperature, int t1, int t2, int a, int b, int[] onboard) {
        int answer = 0;
        int start;
        int diff = 0;
        int s = 0;
        list = new ArrayList<>();
        if(temperature < t1)        diff = t1 - temperature;
        else if(t2 < temperature)   diff = temperature - t2;
        for(int i = 1;  i < onboard.length; i++)
            if(onboard[i] == 1)
                list.add(i);

        //첫번째 요소 
        start = list.get(0);
        list.remove(0);
        answer += diff * a;

        //나머지 요소
        if(a < 2 * b) {
            for(int i : list){
                int A = i - start - s; 
                if(diff * 2 < A + 1){
                    answer += diff * a;
                    s = 0;
                    if(s == 1 && b < a) answer += b - a;
                }
                else{
                    answer += ((A + 1) / 2) * a;
                    s = A % 2;
                }
                start = i;
            }
            if(s == 1 && b < a) answer += b - a;
        }
        else{
            for(int i : list){
                int A = i - start;
                if(A < 2 * diff)
                    answer += A * b; 
                else{
                    if(A * b < diff * a) 
                        answer += A * b;   
                    else
                        answer += diff * a; 
                }               
                start = i;
            } 
        }           
        return answer;
    }
}