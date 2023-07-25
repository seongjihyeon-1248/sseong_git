package LV_2;

import java.util.Arrays;

public class Seesaw {
    public static void main(String args[]){
        System.out.print(new Solution_Seesaw().solution((new int[]{100,180,360,100,270})));
    }
}

class Solution_Seesaw {
    public long solution(int[] weights) {
        long answer = 0;
        int count = 0;
        long same  = 1;
        Arrays.sort(weights);
        int num = weights.length;
        for(int i = 0; i < num - 1; i++){
            if(weights[i] == weights[i + 1]){
                same++;
                continue;
            }
            count = 0;
            for(int ii = i + 1; ii < num; ii++){
                if( 
                    weights[i] * 2 == weights[ii] ||
                    weights[i] * 4 == weights[ii] * 3 || 
                    weights[i] * 3 == weights[ii] * 2)
                    count++;
            }
            answer += ((same - 1) + count * 2) * same / 2;
            System.out.println(same + " " + count + " " + (((same - 1) + count * 2) * same / 2));
            same = 1;
        }
        return answer + (same - 1) * same / 2;
    }
}