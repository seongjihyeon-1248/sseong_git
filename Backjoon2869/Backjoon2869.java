package Backjoon2869;

public class Backjoon2869 {
    public static void main(String args[]){
        int A = 100, B = 99, V = 1000000000, i = 1;
        int C = A - B;
        for(int l = A; l < V; l += C)
            i++;
        System.out.print(i);
    }
}
