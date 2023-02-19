//https://school.programmers.co.kr/learn/courses/30/lessons/120854
package LV_0;

import java.util.*;

public class Element_Length_of_Array{
    public static void main(String args[]){
        System.out.println(new Solution_Element_Length_of_Array().solution(new String[]{"We", "are", "the", "world!"}));
    }
}
class Solution_Element_Length_of_Array {
    public ArrayList<Integer> solution(String[] strlist) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (String i : strlist)
            answer.add(i.length());
        return answer;
    }
}