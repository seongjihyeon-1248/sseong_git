//https://school.programmers.co.kr/learn/courses/30/lessons/150370
package LV_1;

import java.util.*;

public class Personal_information_collection_experation_date{
    public static void main(String args[]){
        System.out.println(new Solution_Personal_information_collection_experation_date().solution(
            "2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"}));
    }
}

class Solution_Personal_information_collection_experation_date {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        double tod = Integer.parseInt(today.substring(0, 4)) * 12 + Integer.parseInt(today.substring(5, 7)) + Integer.parseInt(today.substring(8)) / 28.0;
        HashMap<String, Integer> ter = new HashMap<String, Integer>(); 
        ArrayList<Double> pri = new ArrayList<Double>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(String i: terms)
            ter.put(i.split(" ")[0], Integer.parseInt(i.split(" ")[1]));
        for(String i: privacies)
            pri.add((ter.get(i.split(" ")[1])+ Integer.parseInt(i.split(" ")[0].substring(0, 4)) * 12 + Integer.parseInt(i.split(" ")[0].substring(5, 7)) + Integer.parseInt(i.split(" ")[0].substring(8)) / 28.0));
        for(int i = 0; i < pri.size(); i++)
            if(pri.get(i) <= tod)
                result.add(i + 1);
        return result;
    }
}