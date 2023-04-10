package Backjoon1712;

public class Backjoon1712{
    public static void main(String args[]){
        int A = 2100000000, B = 9, C = 10;
        int i = 0;
        if(B > C)
            System.out.print("-1");
        else{
            while(true){
                if(A < (C - B) * i)
                    break;
                i++;
            }
            System.out.print(i);
        }
    }

}