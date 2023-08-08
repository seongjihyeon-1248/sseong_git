//https://school.programmers.co.kr/learn/courses/30/lessons/214288
package LV_3;

import java.util.ArrayList;
import java.util.Collections;

public class Schedule {
    public static void main(String args[]){
        System.out.println(new Solution_Schedule().solution(3, 5, new int[][]{{10, 60, 1}, {15, 100, 3}, {20, 30, 1}, {30, 50, 3}, {50, 40, 1}, {60, 30, 2}, {65, 30, 1}, {70, 100, 2}}));
    }
}

class Solution_Schedule {
    public int solution(int k, int n, int[][] reqs) {
        int answer = 0;
        ArrayList<Integer>[] list = new ArrayList[k + 1];
        for(int i = 1; i < k + 1; i++)
            list[i] = new ArrayList<>();
        for(int[] req : reqs){
            //시간이 지난 스케줄러 삭제
            for(int i = 1; i <= k; i++){
                for(int ii = 1; ii < list[i].size(); ii++){
                    if(list[i].get(ii) <= req[0]){
                        list[i].remove(ii);
                        ii--;
                    }
                }
            }
            //해당 유형의 스케줄러가 없을 때
            if(list[req[2]].size() == 0){
                list[req[2]].add(req[0]+req[1]);
            }
            //해당 유형의 스케줄러가 있을 때
            else{
                //N은 사용되고 있는 스케줄러
                int N = 0;
                for(int i = 1; i < k + 1; i++){
                    if(list[i].size() == 0) N++;
                    else N += list[i].size();
                }
                //쉬고 있는 스케줄러가 있을 때
                if(N < n){
                    list[req[2]].add(req[0]+req[1]);
                    Collections.sort(list[req[2]]);
                }
                //쉬고 있는 스케줄러가 없을 때
                else{
                    int Min = req[2];
                    int min = list[req[2]].get(0);
                    for(int i = 1; i < k + 1; i++){
                        if(list[i].size() > 1){
                            if(list[i].get(0) < min){
                                min = list[i].get(0);
                                Min = i;
                            }
                        }
                    }
                    list[Min].remove(0);
                    list[req[2]].add(min+req[1]);
                    Collections.sort(list[req[2]]);
                    answer += min - req[0];
                }
            }
            System.out.println(req[0]);
            System.out.println(list[1]);
            System.out.println(list[2]);
            System.out.println(list[3]);
            System.out.println();
        }
        return answer;
    }
}