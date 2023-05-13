//https://school.programmers.co.kr/learn/courses/30/lessons/181927
package LV_0;

public class The_last_two_elements {
    public static void main(String args[]){
        System.out.println(new Solution_The_last_two_elements().solution(new int[]{2, 1, 6}));
    }
}

class Solution_The_last_two_elements {
    public int[] solution(int[] num_list) {
        int mylist_len = num_list.length;
        int[] answer = new int[mylist_len + 1];
        System.arraycopy(num_list, 0, answer, 0, mylist_len);
        if(num_list[mylist_len - 2] < num_list[mylist_len - 1])     answer[mylist_len] = num_list[mylist_len - 1] - num_list[mylist_len - 2];
        else                                                        answer[mylist_len] = num_list[mylist_len - 1] * 2;
        return answer;
    }
}