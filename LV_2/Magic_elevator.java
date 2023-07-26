//https://school.programmers.co.kr/learn/courses/30/lessons/148653
package LV_2;

class Magic_elevator{
    public static void main(String args[]){
        System.out.println(new Solution_Magic_elevator().solution(5555));
    }
}

class Solution_Magic_elevator {
    public int solution(int storey) {
        int answer = 0;
        while(storey > 0) {
            if(storey % 100 > 54){
                if(storey % 10 > 4){
                    answer += 10 - storey % 10;
                    storey = storey / 10 + 1;
                }
                else{
                    answer += storey % 10;
                    storey /= 10;
                } 
            }
            else{
                if(storey % 10 > 5){
                    answer += 10 - storey % 10;
                    storey = storey / 10 + 1;
                }
                else{
                    answer += storey % 10;
                    storey /= 10;
                }
            }
        }
        return answer;
    }
}