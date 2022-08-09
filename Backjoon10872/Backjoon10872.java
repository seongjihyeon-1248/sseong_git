package Backjoon10872;

public class Backjoon10872 {
    public static int fac(int n){
        if(n == 1)
            return 1;
        return n * fac(n - 1);
    }
    public static void main(String args[]){
        int N = 10;
        System.out.print(fac(N));
    }
}
