package Backjoon2562;
import java.util.*;
public class Backjoon2562 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  MAX = 0;
        int max = sc.nextInt();
        for(int i = 1; i < 9; i++){
            int m = sc.nextInt();
            if(max < m){
                MAX = i;
                max = m;
            }
        }
        System.out.println(max);
        System.out.print(MAX + 1);
    }
}