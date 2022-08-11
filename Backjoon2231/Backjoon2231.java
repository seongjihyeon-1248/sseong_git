package Backjoon2231;

public class Backjoon2231{
    public static void main(String args[]){
        int N = 216;
        for(int i = 1; i < N; i++){
            int temp = i;
            int num = i;
            while(temp > 0){
                num += temp % 10;
                temp /= 10;
            }
            if(num == N){
                System.out.print(i);
                N = 0;
                break;
            }
        }
        if(N != 0)
            System.out.print("0");
    }
}