package Backjoon1110;
public class Backjoon1110{
    public static void main(String args[]){
        int N, cycle = -1;
        N = 26;
        int n = N;
        while(++cycle == 0 || n != N)
            n = (n % 10) * 10 + (n % 10 + n / 10) % 10;
        System.out.print(cycle);
    }                                 
}