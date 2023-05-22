package Backjoon1676;

public class Backjoon1676{
    public static void main(String args[]){
        int N = 10;
        int count = 0;
        while (N >= 5){
            count += N / 5;
            N /= 5;
        }
        System.out.print(count);
    }
}