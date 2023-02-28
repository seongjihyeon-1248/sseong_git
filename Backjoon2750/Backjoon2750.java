package Backjoon2750;

import java.util.*;

public class Backjoon2750{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            n.add(sc.nextInt());

        Collections.sort(n);

        for(Integer i : n) 
            System.out.println(i);
    }
}