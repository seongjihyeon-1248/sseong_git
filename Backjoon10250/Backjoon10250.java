package Backjoon10250;
import java.util.*; 
public class Backjoon10250{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int T = sc.nextInt(); 
        int h, w, n;
        for(int i = 0; i < T; i++){
            h = sc.nextInt(); 
            w = sc.nextInt(); 
            n = sc.nextInt(); 
            sc.close();
            if(n % h == 0)
                System.out.println(h * 100 + (n / h));
            else
                System.out.println((n % h) * 100 + (n / h) + 1);
        }
    }
}