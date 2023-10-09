//https://school.programmers.co.kr/learn/courses/30/lessons/120823
package LV_0;

import java.util.Scanner;

public class Print_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 0; i < n; i++){
            for(int ii = 0; ii <= i; ii++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}