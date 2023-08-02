//https://school.programmers.co.kr/learn/courses/30/lessons/181941
package LV_0;

public class List_to_string {
    public static void main(String args[]){
        System.out.println(new Solution_List_to_string().solution(new String[]{"a","b","c"}));
    }
}

class Solution_List_to_string {
    public String solution(String[] arr) {
        StringBuilder answer = new StringBuilder();;
        for(String s : arr)
            answer.append(s);
        return answer.toString();
    }
}