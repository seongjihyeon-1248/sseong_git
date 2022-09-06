package Backjoon1764;

import java.util.ArrayList;
import java.util.Collections;

public class Backjoon1764 {
    public static void main(String args[]){
        int N;
        N = 3;
        ArrayList<String> n = new ArrayList<String>();
        String[] nn = {"ohhenrie", "charlie", "baesangwook"};
        for(int i = 0; i < N; i++)
            n.add(nn[i]);
        int M;
        M = 4;
        ArrayList<String> m = new ArrayList<String>();
        String[] mm = {"obama", "baesangwook", "ohhenrie", "clinton"};
        for(int i = 0; i < M; i++)
            m.add(mm[i]);
        n.retainAll(m);
        Collections.sort(n);

        System.out.println(n.size());

        for(String i : n)
            System.out.println(i); 
    }
}