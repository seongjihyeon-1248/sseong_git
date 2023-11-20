package LV_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class All_case_of_add {
    public static void main(String args[]){
        System.out.println(new Solution_All_case_of_add().solution(new int[]{2, 1, 3, 4, 1}));
    }
}

class Solution_All_case_of_add {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++)
            for(int ii = i + 1; ii < numbers.length; ii++)
                list.add(numbers[i] + numbers[ii]);
        Set<Integer> set = new HashSet<Integer>(list);
        ArrayList<Integer> a = new ArrayList<>(set);
        int[] answer = a.stream().mapToInt(Integer::intValue).toArray();
        java.util.Arrays.sort(answer);
        return answer;
    }
}