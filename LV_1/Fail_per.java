//https://school.programmers.co.kr/learn/courses/30/lessons/42889
package LV_1;

import java.util.ArrayList;

public class Fail_per {
    public static void main(String args[]){
        System.out.print(new Solution_Fail_per().solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}));
    }
}

class Solution_Fail_per {
    public int[] solution(int N, int[] stages) {
        ArrayList<Integer> n = new ArrayList<>();
        double[] ans_fail = new double[N + 2];
        int[] ans_challenge = new int[N + 2];
        int[] answer = new int[N];

        for(int i = 1; i < N + 2; i++)
            ans_fail[i] = 0.0;
        for(int i : stages)
            ans_fail[i] += 1.0;

        for(int i = 1; i < N + 2; i++)
            ans_challenge[i] = stages.length;
        for(int i : stages)
            for(int ii = i + 1; ii < N + 1; ii++)
                ans_challenge[ii] -= 1;
        
        for(int i = N; i > 0; i--){
            if(ans_challenge[i] == 0){
                N--;
                answer[N] = i;
            }
            else 
                n.add(i);
        }

        for(int i = 0; i < N; i++){
            double max = -1.0;
            int max_index = 0;
            for(int num : n){
                if(max <= ans_fail[num] / ans_challenge[num]){
                    max = ans_fail[num] / ans_challenge[num];
                    max_index = num;
                }
            }
            answer[i] = max_index;
            System.out.println(max_index);
            n.remove(n.indexOf(max_index));
        }

        return answer;
    }
}