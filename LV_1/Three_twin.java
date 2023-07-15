//https://school.programmers.co.kr/learn/courses/30/lessons/131705

package LV_1;

class Three_twin{
    public static void main(String args[]){
        System.out.println(new Solution_Three_twin().solution(new int[]{-1, 1, -1, 1}));
    }
}

class Solution_Three_twin {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length - 2; i++){
            for(int ii = i + 1; ii < number.length - 1; ii++){
                for(int iii = ii + 1; iii < number.length; iii++){
                    if(number[i] + number[ii] + number[iii] == 0) 
                        answer++;
                }  
            }
        }
        return answer;
    }
}