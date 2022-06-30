package Backjoon2753;

public class Backjoon2753 {
    public static void main(String args[]){
        int a;
        a = 2000;
        if((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)    System.out.print("1");
        else                                                System.out.print("0");
    }
}