package Backjoon2751;

import java.util.ArrayList;
import java.util.Collections;

public class Backjoon2751 {
    public static void main(String args[]){
        int N = 5;
        ArrayList<Integer> n = new ArrayList<Integer>();
        int[] mn = {5, 4, 3, 2, 1};
        for(int i = 0; i < N; i++)
            n.add(mn[i]);

        Collections.sort(n);

        for(Integer i : n) 
            System.out.println(i);
    }
}
