package Backjoon1546;
import java.util.*;
public class Backjoon1546 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double M = 0.0, sum = 0.0;
        for(int i = 0; i < N; i++){
            double n = sc.nextInt();
            sum += n;
            if(i == 0)
                M = n;
            else
                if(M < n)
                    M = n;
        }
        System.out.print(sum/N/M*100);
    }
}