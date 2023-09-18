package LV_1;

import java.util.HashMap;

public class Run_race {
    public static void main(String args[]){
        System.out.print(new Solution_Run_race().solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"}));
    }
}

class Solution_Run_race {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i = 0; i < players.length; i++){
            answer[i] = players[i];
            hm.put(players[i], i);
        }
        for(String calling: callings){
            int location = hm.get(calling);
            hm.put(answer[location - 1], location);
            hm.put(calling, location - 1);
            answer[location] = answer[location - 1];
            answer[location - 1] = calling;
        }
        return answer;
    }
}