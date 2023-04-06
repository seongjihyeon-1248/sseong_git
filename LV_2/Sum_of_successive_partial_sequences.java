//https://school.programmers.co.kr/learn/courses/30/lessons/178870
package LV_2;
public class Sum_of_successive_partial_sequences{
    public static void main(String args[]){
        System.out.println(new Solution_Sum_of_successive_partial_sequences().solution(new int[]{1, 2, 3, 4, 5}, 7));
    }
}

class Solution_Sum_of_successive_partial_sequences {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int K = 0;
        for(int i = 1; i <= sequence.length; i++){
            for(int s = 0; s < i; s++){
                K += sequence[s];
            }
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
            K = 0;
        }
        return answer;
    }
}