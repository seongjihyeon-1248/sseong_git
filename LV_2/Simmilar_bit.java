//https://school.programmers.co.kr/learn/courses/30/lessons/148652
package LV_2;

public class Simmilar_bit {
    public static void main(String args[]){
        System.out.println(new Solution_Simmilar_bit().solution(1, 2, 3));
    }
}

class Solution_Simmilar_bit {
    int answer;
    long L;
    long R;
    public int solution(int n, long l, long r) {
        answer = 0;
        L = l;
        R = r;
        count(1, n);
        return answer;
    }
    void count(long one, int n){
        if(one <= R){
           if(n > 0){
                count(one * 5 - 4, n - 1);
                count(one * 5 - 3, n - 1);
                count(one * 5 - 1, n - 1);
                count(one * 5, n - 1);
            }
            else{
                if(L <= one)
                    answer++;
            } 
        }
    }
}   