package Backjoon1065;

public class Backjoon1065 {
    public static void main(String args[]){
        int N = 110;
        new Han_num(N);
    }
}

class Han_num{
    int count = 0;
    Han_num(int n){
        int[] a = new int[1001]; 

        for(int i = 1; i < 100; i++)
                a[i] = 1;

        for(int i = 100; i < 1000; i++)
            if((i % 10 + i / 100) == ((i % 100) / 10) * 2)
                a[i] = 1;
            else
                a[i] = 0;
        
        a[1000] = 0;

        for(int i = 1; i <= n; i++)
            if(a[i] == 1)
                this.count++; 
        System.out.print(count);
    }
}