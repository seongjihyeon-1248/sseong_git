//https://school.programmers.co.kr/learn/courses/30/lessons/12969
package LV_1;

import java.util.Scanner;

public class Draw_a_rectangle_star{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for(int i = 0; i < b; i++){
            for(int ii = 1; ii < a; ii++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}