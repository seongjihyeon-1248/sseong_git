package Backjoon2609;

public class Backjoon2609{
    public static void main(String args[]){
        int A = 24;
        int B = 18;
        int min, max;
        if(A < B){
            min = A;
            max = B;
        }
        else{
            min = B;
            max = A;
        }

        while(--min > 1)
            if(A % min == 0 && B % min == 0){
                System.out.println(min);
                break;
            }

        for(int i = 1; ; i++){
            if((max * i) % A == 0 && (max * i) % B == 0){
                System.out.println(max * i);
                break;
            }
        }
    }
}