package Backjoon2839;

public class Backjoon2839 {
    public static void main(String args[]){
        int N = 18;
        int i, ii;
        for(i = 0; i <= (N / 3); i++){
            for(ii = 0; ii <= (N / 5); ii++)
                if(i * 3 + ii * 5 == N){
                    System.out.print(i + ii);
                    i = -1;
                }
            if(i == -1)
                break;
        }
        if(i != -1)
            System.out.print("-1");
    }
}
