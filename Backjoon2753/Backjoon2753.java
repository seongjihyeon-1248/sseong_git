package Backjoon2753;

import java.util.*;

public class Backjoon2753 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)    System.out.print("1");
        else                                                System.out.print("0");
    }
}