package Backjoon10816;

import java.util.ArrayList;

public class Backjoon10816{
    public static void main(String args[]){
        int N;
        N = 10;
        ArrayList<Integer> n = new ArrayList<Integer>();
        int[] nn = {6, 3, 2, 10, 10, 10, -10, -10, 7, 3};
        for(int i = 0; i < N; i++)
            n.add(nn[i]);
        int M;
        M = 8;
        ArrayList<Integer> m = new ArrayList<Integer>();
        int[] mm = {10, 9, -5, 2, 3, 4, 5, -10};
        for(int i = 0; i < M; i++)
            m.add(mm[i]);
        
        int count = 0;

        for(int i = 0; i < M; i++){
            count = 0;
            for(int ii = 0; ii < N; ii++)
                if(m.get(i) == n.get(ii))
                    count++;
            System.out.print(count + " ");
        }
    }
}