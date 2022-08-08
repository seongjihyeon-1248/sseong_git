package Backjoon10872;

public class Backjoon10872 {
    public static void main(String args[]){
        int N = 10, f = 1;
        for(int i = N; i > 0; i--)
            f *= i;
        System.out.print(f);
    }
}
