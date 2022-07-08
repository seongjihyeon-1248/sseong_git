package Backjoon10250;

public class Backjoon10250{
    public static void main(String args[]){
        int T = 2;
        int[] h = {6, 30};
        int[] w = {12, 50};
        int[] n = {10, 72};
        for(int i = 0; i < T; i++)
            System.out.println((n[i] % h[i]) * 100 + (n[i] + h[i] - 1) / h[i]);
    }
}