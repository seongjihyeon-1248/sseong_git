package Backjoon4948;

import java.util.ArrayList;

public class Backjoon4948 {
    public static void ber(int n){
        int num = n + 1;
        int[] nm = new int[num];
        int count = 0;
        
        for(int i = 1; i < num; i++)
        nm[i] = i + n;

        if(nm[0] == 1) 
            nm[0] = 0;

        for(int i = 2; i < n; i++)
            for(int ii = 0; ii < num; ii++)
                if(nm[ii] != 0 && nm[ii] % i == 0) 
                    nm[ii] = 0;

        for(int i = 0; i < num; i++)
            if(nm[i] != 0)
                nm[count++] = nm[i];

        for(int i = 0; i < count; i++)
            if(nm[i] != 0)
                for(int ii = i + 1; ii < count; ii++)
                    if(nm[ii] != 0 && nm[ii] % nm[i] == 0)
                        nm[ii] = 0;

        num = 0;
        for(int i = 0; i < count; i++)
            if(nm[i] != 0)
                nm[num++] = nm[i];
        System.out.println(num);
    }
    public static void main(String args[]){
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(1);
        n.add(10);
        n.add(13);
        n.add(100);
        n.add(1000);
        n.add(10000);
        n.add(100000);
        for(Integer i : n) 
            ber(i);
    }
}