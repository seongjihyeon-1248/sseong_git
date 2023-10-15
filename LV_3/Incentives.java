package LV_3;

public class Incentives {
    public static void main(String args[]){
        System.out.println(new Solution_Incentives().solution(new int[][]{{2,2},{1,4},{3,2},{3,2},{2,1}}));
    }
}

class Solution_Incentives {
    public int solution(int[][] scores) {
        int answer = 1;
        int sum = scores[0][0] + scores[0][1];
        for(int i = 1 ; i < scores.length ; i++){
            if(scores[0][0] < scores[i][0] && scores[0][1] < scores[i][1]){
                return -1;
            }
            else{
                if(sum < scores[i][0] + scores[i][1]){
                    answer++;
                    for(int ii = 0 ; ii < scores.length ; ii++){
                        if(scores[i][0] < scores[ii][0] && scores[i][1] < scores[ii][1]){
                            answer--;
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}