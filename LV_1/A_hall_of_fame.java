package LV_1;

class A_hall_of_fame{
    public static void main(String args[]){
        System.out.println(new Solution_A_hall_of_fame().solution(3, new int[]{10, 100, 20, 150, 1, 100, 200}));
    }
}

class Solution_A_hall_of_fame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] K = new int[k];
        int ii;
        int I;
        if(k > score.length) I = score.length;
        else I = k;
        for(int i = 0; i < I; i++){
            for(ii = i; ii > 0; ii--){
                if(score[i] > K[ii - 1])
                    K[ii] = K[ii - 1];
                else break;
            }
            K[ii] = score[i];
            answer[i] = K[i];
        }
        for(int i = k; i < score.length; i++){
            if(K[k-1] < score[i]){
                for(ii = k - 1; ii > 0; ii--){
                    if(score[i] > K[ii - 1])
                        K[ii] = K[ii - 1];
                    else break;
                }
                K[ii] = score[i];
            }
            answer[i] = K[k-1];
        }
        return answer;
    }
}