package Backjoon2108;

import java.util.*;

public class Backjoon2108 {
    public static void main(String args[]){
        int N = 5;
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(1);
        n.add(3);
        n.add(8);
        n.add(-2);
        n.add(2);
        int sum = 0;
        for(int i : n)
            sum += i;
        System.out.println(Math.round(sum / (N + 0.0)));
        Collections.sort(n);
        System.out.println(n.get(N / 2));
        /* 
        counter_n = Counter(n).most_common()
        Max_n = counter_n[0][1]
        max_n = []
        for num in counter_n:
            if num[1] == Max_n:
                max_n.append(num[0])
        print(n[(N) // 2])
        if(len(max_n) > 1):
            max_n.sort()
            print(max_n[1])
        else{
            print(max_n)
        }
        */
        System.out.println(Collections.max(n) - Collections.min(n));
    }
}
