package Backjoon2004;

public class Backjoon2004 {
    public static void main(String args[]){
        int n = 25;
        int m = 12;
        int count = 0;
        while (n >= 5){
            count += n / 5;
            n /= 5;
        }
        while (m >= 5){
            count -= 2 * (m / 5);
            m /= 5;
        }
        System.out.print(count);
    }
}
