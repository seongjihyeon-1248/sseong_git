package Backjoon1181;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Backjoon1181 {
    public static void main(String args[]){
        int N = 13;
        ArrayList<String> n = new ArrayList<String>();
        String[] mn = {"but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im", "yours"};
        for(int i = 0; i < N; i++)
            if(!n.contains(mn[i]))
                n.add(mn[i]);

        Collections.sort(n);
        Collections.sort(n, Comparator.comparing(String::length));

        for(String i : n) 
            System.out.println(i);
    }
}
