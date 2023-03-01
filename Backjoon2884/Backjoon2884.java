package Backjoon2884;

import java.util.*;

public class Backjoon2884 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();
        if(M > 44)      System.out.print(H + " " + (M - 45));
        else {
            if(H == 0)  System.out.print("23 " + (M + 15));
            else        System.out.print((H - 1) + " " + (M + 15));
        }
    }
}