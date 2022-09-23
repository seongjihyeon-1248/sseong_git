package Backjoon11050;

public class Backjoon11050{
    public static void main(String args[]){
        int N = 5;
        int K = 2; 
        int n = N;
        int k = N - K;
        for(int i = K + 1; i < N; i++)
            n *= i;
        for(int i = 2; i < N - K; i++)
            k *= i;
        System.out.print(n / k);
    }
}