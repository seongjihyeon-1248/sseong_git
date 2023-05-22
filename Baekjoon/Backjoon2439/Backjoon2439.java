package Backjoon2439;

import java.util.*;
public class Backjoon2439 {
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        for(int i = 1; i < N + 1; i++){
            for(int ii = i; ii < N; ii++)
                System.out.print(" ");
            for(int ii = 0; ii < i; ii++)
                System.out.print("*");
            System.out.println();
        }
    }
}