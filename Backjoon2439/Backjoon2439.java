package Backjoon2439;

public class Backjoon2439 {
    public static void main(String ags[]){
        int N;
        N = 5;

        for(int i = 1; i < N + 1; i++){
            for(int ii = i; ii < N; ii++)
                System.out.print(" ");
            for(int ii = 0; ii < i; ii++)
                System.out.print("*");
            System.out.println();
    }
    }
}