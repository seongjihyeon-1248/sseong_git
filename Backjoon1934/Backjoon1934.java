package Backjoon1934;

import java.util.ArrayList;

public class Backjoon1934 {
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
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
        for(int i = 0; i < T; i++)
            System.out.println((A.get(i) * B.get(i)) / gcd(A.get(i), B.get(i)));
    }
}
