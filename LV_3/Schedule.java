//https://school.programmers.co.kr/learn/courses/30/lessons/214288
package LV_3;

import java.util.ArrayList;

public class Schedule {
    public static void main(String args[]){
        System.out.println(new Solution_Schedule().solution(3, 5, new int[][]{{10, 60, 1}, {15, 100, 3}, {20, 30, 1}, {30, 50, 3}, {50, 40, 1}, {60, 30, 2}, {65, 30, 1}, {70, 100, 2}}));
    }
}

class Solution_Schedule {
    ArrayList<Integer> ans;
    int[][] k_n;
    int K;
    int N;
    public int solution(int k, int n, int[][] reqs) {
        int answer = 0;
        K = k;
        N = n;
        k_n = new int[k + 1][n-k+2];
        ans = new ArrayList<>();
        ArrayList<Integer>[] list = new ArrayList[k + 1];
        for(int i = 1; i < n-k+2; i++){
            //스케줄러 초기화
            for(int ii = 1; ii < k + 1; ii++)
                list[ii] = new ArrayList<>();
            for(int ii = 1; ii < k + 1; ii++)
                for(int iii = 0; iii < i; iii++)
                    list[ii].add(0);
            //i명의 멘토가 있을 경우의 대기 시간 구하여 배열에 저장
            for(int[] req: reqs){
                int Min = 0;
                for(int ii = 1; ii < i; ii++){
                    if(list[req[2]].get(ii) < list[req[2]].get(Min))
                        Min = ii;
                }
                if(list[req[2]].get(Min) < req[0]) 
                    list[req[2]].set(Min, req[0] + req[1]);
                else{
                    k_n[req[2]][i] += list[req[2]].get(Min) - req[0];
                    list[req[2]].set(Min, list[req[2]].get(Min) + req[1]);
                }
            }
        } 
        return answer;
    }
}