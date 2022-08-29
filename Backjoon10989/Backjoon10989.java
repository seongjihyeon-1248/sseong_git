package Backjoon10989;

import java.util.ArrayList;
import java.util.Collections;

public class Backjoon10989{
    public static void main(String args[]){
        int N = 10;
        ArrayList<Integer> n = new ArrayList<Integer>();
        int[] mn = {5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
        for(int i = 0; i < N; i++)
            n.add(mn[i]);

        Collections.sort(n);

        for(Integer i : n) 
            System.out.println(i);
    }
}