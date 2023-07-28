package LV_2;

import java.util.ArrayList;

public class Simmilar_bit {
    public static void main(String args[]){
        System.out.println(new Solution_Simmilar_bit().solution(2, 4, 17));
    }
}

class Solution_Simmilar_bit {
    ArrayList<int[]> list;
    public int solution(int n, long l, long r) {
        int answer = 0;
        list = new ArrayList<>();
        return answer;
    }
    void a(int aa, int aaa, int n){
        if(n != 0){
            a(aa * 5, aaa * 5, n - 1);
        }
        else{
            list.add(new int[]{aa, aaa})
        }
    }
}   