package Backjoon2438;

import java.util.*;

public class Backjoon2438 {
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i = 1; i < N + 1; i++){
            for(int ii = 1; ii < i; ii++)
                System.out.print("*");
            System.out.println("*");
        }
    }
}