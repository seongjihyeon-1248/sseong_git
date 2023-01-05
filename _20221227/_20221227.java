package _20221227;

import java.util.ArrayList;
import java.util.Collections;

public class _20221227{
    public static int Solution(int k, int[] tangerine) {
        int answer = 0;
        ArrayList<Integer> tan = new ArrayList<Integer>();
        ArrayList<Integer> freq = new ArrayList<Integer>();
        for(int i : tangerine){
            if(tan.contains(i)){
                int index = tan.indexOf(i);
                freq.set(index, freq.get(index) + 1);
            }
            else { 
                tan.add(i);
                freq.add(1);
            }
        }
        Collections.sort(freq, Collections.reverseOrder());
        for(int i : freq){
            k -= i;
            answer ++;
            if(k <= 0)
                break;
        }
        return answer;
    }
    public static void main(String args[]){
        System.out.println(Solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3}));
    }
}