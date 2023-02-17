package Backjoon1427;

import java.util.*;

public class Backjoon1427{
    public static void main(String ars[]){
        ArrayList<Integer> a = new  ArrayList<Integer>();
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(3);
        Collections.sort(a, Collections.reverseOrder());
        for(int i : a) System.out.print(i);
    }
}