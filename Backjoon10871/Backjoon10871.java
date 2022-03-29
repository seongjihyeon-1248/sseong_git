package Backjoon10871;

public class Backjoon10871 {
    public static void main(String args[]){
        int[] a = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};
        int N, X;
        N = 10;
        X = 5;
        int[] A =  new int[N];

        for(int i = 0; i < N; i++)
            A[i] = a[i];

        for(int i = 0; i < N; i++)
            if(A[i] < X) System.out.print(A[i] + " ");
    }
}
