package Backjoon4153;

import java.util.ArrayList;
import java.util.Arrays;

public class Backjoon4153{
    public static void main(String args[]){
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        list.add(new Integer[]{6, 8, 10});                                     
        list.add(new Integer[]{25, 52, 60});
        list.add(new Integer[]{5, 12, 13});
        list.add(new Integer[]{0, 0, 0});
        int i = 0;
        
        while(true){
            Arrays.sort(list.get(i));
            if(Math.pow(list.get(i)[0], 2) + Math.pow(list.get(i)[1], 2) == Math.pow(list.get(i)[2], 2)){
                if(list.get(i)[2] == 0)
                    break;
                System.out.println("right");
            }
            else
                System.out.println("wrong");
            i++;
        }
    }
}