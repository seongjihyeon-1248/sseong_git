//https://school.programmers.co.kr/learn/courses/30/lessons/154540
package LV_2;

import java.util.ArrayList;
import java.util.Collections;

public class Trip_to_island {
    public static void main(String args[]){
        System.out.println(new Solution_Trip_to_island().solution(new String[]{"X591X","X1X5X","X231X", "1XXX1"}));
    }
}

class Solution_Trip_to_island {
    boolean[][] map;
    String[] maps;
    int max_row;
    int max_colomn;
    public int[] solution(String[] maps) {
        max_row = maps[0].length();
        max_colomn = maps.length;
        map = new boolean[max_colomn][max_row];
        this.maps = maps;

        for(int i = 0; i < max_colomn; i++){
            for(int ii = 0; ii < max_row; ii++){
                String s = ""+ maps[i].charAt(ii);
                if(s.equals("X")){
                    map[i][ii] = true;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = 0; i < max_colomn; i++){
            for(int ii = 0; ii < max_row; ii++){
                int find = find(i, ii);
                System.out.println(i +" "+ ii +" "+ find);
                if(find > 0) ans.add(find);
            }
        }

        if(ans.size() == 0) return new int[]{-1};
        int[] answer = new int[ans.size()];
        Collections.sort(ans);
        for(int i = 0; i < ans.size(); i++)
            answer[i] = ans.get(i);
        return answer;
    }
    public int find(int colomn, int row){
        if(colomn >= 0 && row >= 0 && colomn < max_colomn && row < max_row){
            String s = ""+ maps[colomn].charAt(row);
            if(!map[colomn][row]){
                map[colomn][row] = true;
                return Integer.parseInt(s) + find(colomn, row+1) + find(colomn+1, row) + find(colomn -1, row) + find(colomn, row - 1);
            }
        }
        return 0;
    }
}