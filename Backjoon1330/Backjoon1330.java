package Backjoon1330;

import java.util.*;
public class Backjoon1330{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        if(A < B)           System.out.print("<");
        else if (A > B)     System.out.print(">");
        else                System.out.print("==");
    }                                   
}