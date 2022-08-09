package Backjoon4673;

public class Backjoon4673 {
    public static void selfnum(){
        int[] a = new int[10000]; 
        for(int i = 0; i < 10000; i++)
            a[i] = 0;

        for(int i = 0; i < 10; i++)
            for(int ii = 0; ii < 10; ii++)
                if(i*11+ii*2 < 100)
                    a[i*11+ii*2] = 1;

        for(int i = 0; i < 10; i++)
            for(int ii = 0; ii < 10; ii++)
                for(int iii = 0; iii < 10; iii++)
                    if(i*101+ii*11+iii*2 < 1000)
                        a[i*101+ii*11+iii*2] = 1;

        for(int i = 0; i < 10; i++)
            for(int ii = 0; ii < 10; ii++)
                for(int iii = 0; iii < 10; iii++)
                    for(int iiii = 0; iiii < 10; iiii++)
                        if(i*1001+ii*101+iii*11+iiii*2 < 10000)
                            a[i*1001+ii*101+iii*11+iiii*2] = 1;

        for(int i = 1; i < 10000; i++)
            if(a[i] == 0) 
                System.out.println(i); 
    }
    public static void main(String args[]){
        selfnum();
    }
}