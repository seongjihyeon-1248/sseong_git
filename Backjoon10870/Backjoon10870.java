package Backjoon10870;
import java.util.Scanner;
public class Backjoon10870 {
    public static int fibo(int n){
            if(n == 0) return 0;
            else if(n == 1) return 1;
            return fibo(n - 1) + fibo (n - 2); 
        }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
}