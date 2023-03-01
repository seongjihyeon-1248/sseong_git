package Backjoon10872;
import java.util.Scanner;
public class Backjoon10872 {
    public static int fac(int n){
        if(n <= 1) return 1;
        return n * fac(n - 1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        System.out.print(fac(N));
    }
}