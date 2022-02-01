package Backjoon2884;

public class Backjoon288 {
    public static void main(String args[]){
        int H, M;
        H = 10;
        M = 10;
        if(M > 45) M -= 45;
        else {
            M += 15;
            if(H == 0) H = 23;
            else H--;
        }
        System.out.print(H + " " +M);
    }
}