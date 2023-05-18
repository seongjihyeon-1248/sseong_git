package LV_2;

import java.util.Stack;

class Finding_behind_bigger_num{
    public static void main(String args[]){
        System.out.println(new Solution_Finding_behind_bigger_num().solution(new int[]{2, 3, 3, 5}));
    }
}

class Solution_Finding_behind_bigger_num{
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> s = new Stack<>();
    
        for(int i = numbers.length - 1; i >= 0; i--){
            while(!s.isEmpty()){
                if(s.peek() > numbers[i]){
                    answer[i] = s.peek();
                    break;
                }else{
                    s.pop();
                }
            }
            if(s.isEmpty()){
                answer[i] = -1;
            }
            s.push(numbers[i]);
        }
        return answer;
    }
}