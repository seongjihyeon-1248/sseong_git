//https://school.programmers.co.kr/learn/courses/30/lessons/181186
package LV_3;

import java.util.ArrayList;

public class Tiling{
    public static void main(String args[]){
        System.out.println(new Solution_Tiling().solution(5));
    }
}

class Solution_Tiling {
    ArrayList<Integer> List;
    int[] N;
    long answer;
    int end;
    public int solution(int n) {
        List = new ArrayList<Integer>();
        answer = 0;
        N = new int[4];
        N[1] = 1;
        N[2] = 3;
        N[3] = 6;
        if(n > 3){
            List.add(3);
            a(new ArrayList<>(List), n - 3);
            List.set(List.size() - 1, 2);
            a(new ArrayList<>(List), n - 2);
            List.set(List.size() - 1, 1);
            a(new ArrayList<>(List), n - 1);
        }
        else if(n == 3)     return 10;
        else if(n == 2)     return 3;
        else if(n == 1)     return 1;
        return (int) ((answer + 1) % 1000000007);
    }
    public void a(ArrayList<Integer> list, int rest){
        if(rest == 0){
            int ans = 1;
            for(int l : list){
                ans *= N[l];
            }
            answer = answer + ans - 1;
        }
        else{
            if(rest > 3){
                int end = list.get(list.size() - 1);
                list.add(3);
                a(new ArrayList<>(list), rest - 3);
                list.set(list.size() - 1, 2);
                a(new ArrayList<>(list), rest - 2);
                if(end != 1) { 
                    list.set(list.size() - 1, 1);
                    a(new ArrayList<>(list), rest - 1);
                }
            }
            else if(rest == 3){
                int end = list.get(list.size() - 1);
                list.add(3);
                a(new ArrayList<>(list), 0);
                list.set(list.size() - 1, 2);
                list.add(1);
                a(new ArrayList<>(list), 0);
                if(end != 1)    a(new ArrayList<>(list), 0);
            }
            else if(rest == 2){
                list.add(2);
                a(list, 0);
            }
            else if(rest == 1){
                list.add(1);
                a(list, 0);
            }
        }
        return;
    }
}