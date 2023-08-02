//https://school.programmers.co.kr/learn/courses/30/lessons/181939
package LV_0;

public class Bigger_merge {
    public static void main(String args[]){
        System.out.println(new Solution_Bigger_merge().solution(9, 91));
    }
}

class Solution_Bigger_merge {
    public int solution(int a, int b) {
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        A.append(a).append(b);
        B.append(b).append(a);
        if(A.toString().compareTo(B.toString()) < 0) A = B;
        return Integer.parseInt(A.toString());
    }
}