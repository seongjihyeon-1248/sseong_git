package Backjoon1010;

import java.util.ArrayList;

public class Backjoon1010{
    public static void main(String args[]){
        int T = 3;
        int[] n = {2, 1, 13}; 
        int[] m = {2, 5, 29};
        ArrayList<Integer> N = new ArrayList<Integer>();
        ArrayList<Integer> M = new ArrayList<Integer>();
        for(int i = 0; i < T; i++){
            if(m[i] - n[i] > n[i])
                N.add(m[i] - n[i]);
            else
                N.add(n[i]);
            M.add(m[i]);
        }
        long nn, mm;
        for(int i = 0; i < T; i++){
            nn = 1;
            mm = 1;
            for(int ii = N.get(i) + 1; ii <= M.get(i); ii++){
                nn *= ii;
            }
            for(int ii = 2; ii <= M.get(i) - N.get(i) ; ii++)
                mm *= ii;
            System.out.println(nn / mm);
        }
    }
}