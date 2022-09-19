package Backjoon1934;

import java.util.ArrayList;

public class Backjoon1934 {
    public static void main(String args[]){
        int T = 3;
        int[] a = {1, 6, 13};
        int[] b = {45000, 10, 17};
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        for(int i = 0; i < T; i++){
            A.add(a[i]);
            B.add(b[i]);
        }
        int max;
        for(int ii = 0; ii < T; ii++){
            if(A.get(ii) < B.get(ii))
                max = B.get(ii);
            else
                max = A.get(ii);

            for(int i = 1; ; i++){
                if((max * i) % A.get(ii) == 0 && (max * i) % B.get(ii) == 0){
                    System.out.println(max * i);
                    break;
                }
            }
        }   
    }
}
