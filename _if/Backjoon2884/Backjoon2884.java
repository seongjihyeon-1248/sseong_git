package _if.Backjoon2884;

public class Backjoon2884 {
    public static void main(String args[]){
        int H, M;
        H = 10;
        M = 10;
        if(M > 44)      System.out.print(H + " " + (M - 45));
        else {
            if(H == 0)  System.out.print("23 " + (M + 15));
            else        System.out.print((H - 1) + " " + (M + 15));
        }
    }
}