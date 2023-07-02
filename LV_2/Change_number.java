//https://school.programmers.co.kr/learn/courses/30/lessons/154538
package LV_2;

import java.util.ArrayList;
import java.util.Collections;

public class Change_number {
    public static void main(String args[]){
        System.out.println(new Solution_Change_number().solution(10, 40, 5));
    }
}

class Solution_Change_number {
    int n;
    int y;
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int solution(int x, int y, int n) {
        this.n = n;
        this.y = y;
        cal(x, 0);
        Collections.sort(list);
        if(list.size() > 0) return list.get(0);
        return -1;
    }
    void cal(int a, int count){
        count++;
        add(a, count);
        two(a, count);
        three(a, count);
    }
    void add(int a, int count){
        a += n;
        if(a < y)       cal(a, count);
        else if(a == y) list.add(count);
    }
    void two(int a, int count){
        a *= 2;
        if(a < y)       cal(a, count);
        else if(a == y) list.add(count);
    }
    void three(int a, int count){
        a *= 3;
        if(a < y)       cal(a, count);
        else if(a == y) list.add(count);
    }
}