//https://school.programmers.co.kr/learn/courses/30/lessons/138475

package LV_3;

public class Multiplication_table {
    public static void main(String args[]){
        System.out.println(new Solution_Multiplication_table().solution(8, new int[]{1, 3, 7}));
    }
}

class Solution_Multiplication_table {
    public int[] solution(int e, int[] starts) {
        int[] E = new int[e + 1];
        int[] A = new int[e + 1];
        int[] answer = new int[starts.length];
        for(int i = 1; i <= e; i++)
            E[i] = 0;
        for(int i = 1; i <= e; i++){
            for(int ii = i; ii <= e; ii += i){
                E[ii] += 1;
            }
        }
        int Max = e;
        for(int i = e; i > 0; i--){
            if(E[i] >= E[Max]){
                A[i] = i;
                Max = i;
            }
            else{
                A[i] = Max;
            }
        }
        for(int i = 0; i < starts.length; i++){
            answer[i] = A[starts[i]];
        }
        return answer;
    }
}