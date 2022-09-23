package Backjoon2609;

public class Backjoon2609{
    public static int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
    public static void main(String args[]){
        int A = 24;
        int B = 18;
        int gcd = gcd(A, B);
        System.out.println(gcd);
        System.out.print(A * B / gcd);
    }
}