package Backjoon2981;

import java.util.ArrayList;
import java.util.Collections;

public class Backjoon2981 {
    public static void main(String args[]){
        int N = 3;
        int[] nn = {6, 34, 38};
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i = 0; i < N; i++)
            n.add(nn[i]);
        for(int i = 2; i < Collections.max(n); i++)
            for(int ii = 0; ii < N - 1; ii++){
                if(n.get(ii) % i != n.get(ii + 1) % i)
                    break;
                if(ii == N - 2)
                    System.out.print(i + " ");
            }
    }
}
