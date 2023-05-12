//https://school.programmers.co.kr/learn/courses/30/lessons/155651

package LV_2;

import java.util.*;

public class Hotel_Booking {
    public static void main(String args[]){
        System.out.println(new Solution_Hotel_Booking().solution(new String[][]{{"15:00", "17:00"}, {"16:40", "18:20"}, {"14:20", "15:20"}, {"14:10", "19:20"}, {"18:20", "21:20"}}));
    }
}

class Solution_Hotel_Booking {
    public int solution(String[][] book_time) {
        int answer = 0;
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (String[] time : book_time) {
            int cnt = 1;
            int t = calTime(time[0]);
            if (hash.containsKey(t)) {
                cnt = hash.get(t) + 1;
                hash.remove(t);
            }
            else{
                array.add(t);
            }
            hash.put(t, cnt);
            cnt = -1;
            t = calTime(time[1]) + 10;
            if (hash.containsKey(t)) {
                cnt = hash.get(t) - 1;
                hash.remove(t);
            }
            else{
                array.add(t);
            }
            hash.put(t, cnt);
        }
        Collections.sort(array);
        int a = 0;
        // 누적합
        for (Integer key : array) {
            a += hash.get(key);
            answer = Math.max(answer, a);
        }
        
        return answer;
    }

    private static int calTime(String time){
        return ((Integer.parseInt(time.substring(0, 2)) * 60) + Integer.parseInt(time.substring(3)));
    }
}