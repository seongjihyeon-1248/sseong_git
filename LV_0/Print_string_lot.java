package LV_0;

import java.util.Scanner;

public class Print_string_lot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        sc.close();
        for(int i = 0; i < n; i++)
            System.out.print(str);
    }
}