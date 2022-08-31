package Backjoon10815;

import java.util.ArrayList;

public class Backjoon10815{
    public static void main(String args[]){
        int N = 5;
        int[] nn = {6, 3, 2, 10, -10};
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            n.add(nn[i]);
        int M = 8;
        int[] mm = {10, 9, -5, 2, 3, 4, 5, -10};
        ArrayList<Integer> m = new ArrayList<Integer>();
        for(int i = 0; i < M; i++)
            m.add(mm[i]);
        int yes = 0;
        for (int i = 0; i < M; i++){
            for (int ii = 0; ii < N; ii++){
                if(n.get(ii) == m.get(i))
                    yes = 1;
            }
            if(yes == 1){
                System.out.print("1 ");
                yes = 0;
            }
            else
                System.out.print("0 ");
        }
    }
}