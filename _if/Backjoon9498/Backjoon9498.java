package _if.Backjoon9498;

public class Backjoon9498 {
    public static void main(String args[]){
        int a;
        a = 100;
        if(90 <= a && a <= 100)         System.out.print("A");
        else if(80 <= a && a <= 89)     System.out.print("B");
        else if(70 <= a && a <= 79)     System.out.print("C");
        else if(60 <= a && a <= 69)     System.out.print("D");
        else                            System.out.print("F");
    }                                   
}