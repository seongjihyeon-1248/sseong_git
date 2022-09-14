package Backjoon1037;

import java.util.Arrays;

public class Backjoon1037{
    public static void main(String args[]){
        int N = 2;
        int[] n ={4, 2};
        Arrays.sort(n);
        int ii = 3;
        while(ii > 0){
            for(int i = 0; i < N; i++){
                if(ii % n[i] != 0)
                    break;
                if(i == N - 1 && ii != n[i]){
                    System.out.print(ii);
                    ii = -1;
                }
            }
            ii++;
        }
    }
}