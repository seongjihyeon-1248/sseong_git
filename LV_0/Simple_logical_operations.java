//https://school.programmers.co.kr/learn/courses/30/lessons/181917
package LV_0;

class Simple_logical_operations{
    public static void main(String args[]){
        System.out.println(new Solution_Simple_logical_operations().solution(false, true, true, true));
    }
}

class Solution_Simple_logical_operations {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}