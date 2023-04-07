//https://school.programmers.co.kr/learn/courses/30/lessons/178870
package LV_2;
public class Sum_of_successive_partial_sequences{
    public static void main(String args[]){
        int[] answer = new Solution_Sum_of_successive_partial_sequences().solution(new int[]{1, 2, 3, 4, 5}, 7);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}

class Solution_Sum_of_successive_partial_sequences {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int K = 0;
        int K_min = 0;
        int k_max = 0;
        for(int i = 1; i <= sequence.length; i++){
            K_min += sequence[i-1];
            k_max += sequence[sequence.length - i];
            if(k <= k_max){
                K = K_min;
                if(K == k){
                    answer[0] = 0;
                    answer[1] = i - 1;
                    return answer;
                }
                for(int ii = i; ii < sequence.length; ii++){
                    K += sequence[ii] - sequence[ii - i];
                    if(K > k) break;
                    else if(K == k){
                        answer[0] = ii - i + 1;
                        answer[1] = ii;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}