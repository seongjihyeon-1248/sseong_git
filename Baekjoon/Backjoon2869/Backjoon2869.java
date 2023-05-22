package Backjoon2869;
import java.util.*;                                              
public class Backjoon2869 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int V = sc.nextInt(); 
        sc.close();
        int C = (V - B) / (A - B);
        if((V - B) % (A - B) != 0)
            C++;
        System.out.print(C);
    }
}