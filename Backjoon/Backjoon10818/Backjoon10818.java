package Backjoon10818;
import java.util.*;
public class Backjoon10818 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = sc.nextInt();
        int min = max;
        for (int i = 1; i < N; i++){
            int n = sc.nextInt();
            if(max < n) max = n;
            if(min > n) min = n;
        }
        sc.close();
        System.out.println(min + " " + max);
    }
}
