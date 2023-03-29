package Backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon10101 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if(a + b + c == 180){
            if(a == 60 && b == 60){
                System.out.print("Equilateral");
            }
            else if(a == b || b == c || c == a){
                System.out.print("Isosceles");
            }
            else{
                System.out.print("Scalene");
            }
        }
        else{
            System.out.print("Error");
        }
    }
}