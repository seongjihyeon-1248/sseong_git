package Backjoon2108;

import java.io.*;
import java.util.*;

public class Backjoon2108 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            n.add(Integer.parseInt(br.readLine()));
        int sum = 0;
        for(int i : n)
            sum += i;
        System.out.println(Math.round(sum / (N + 0.0)));
        Collections.sort(n);
        System.out.println(n.get(N / 2));
        ArrayList<Integer> count = new ArrayList<Integer>();
        HashMap<Integer, Integer> n_counter = new HashMap<Integer, Integer>();
        for (int i : n) {
            int cnt = 1;
            if (n_counter.containsKey(i)) {
                cnt = n_counter.get(i) + 1;
                n_counter.remove(i);
            }
            n_counter.put(i, cnt);
            count.add(cnt);
        }
        int Max_n = Collections.max(count);
        ArrayList<Integer> max_n = new ArrayList<Integer>();
        for (Integer key : n_counter.keySet())
            if(n_counter.get(key) == Max_n)
                max_n.add(key);
        if(max_n.size() > 1){
            Collections.sort(max_n);
            System.out.println(max_n.get(1));
        }
        else{
            System.out.println(max_n.get(0));
        }
        System.out.println(Collections.max(n) - Collections.min(n));
    }
}