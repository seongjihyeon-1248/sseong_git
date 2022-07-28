package Backjoon2581;

public class Backjoon2581 {
    public static void main(String args[]){
        int M = 60;
        int N = 100;
        int num = N - M + 1;
        int[] nm = new int[num];
        int sum = 0;
        int count = 0;
        
        for(int i = 0; i < num; i++)
        nm[i] = i + M;

        if(nm[0] == 1) 
            nm[0] = 0;

        for(int i = 2; i < M; i++)
            for(int ii = 0; ii < num; ii++)
                if(nm[ii] != 0 && nm[ii] % i == 0) 
                    nm[ii] = 0;

        for(int i = 0; i < num; i++)
            if(nm[i] != 0)
                nm[count++] = nm[i];

        for(int i = 0; i < count; i++)
            if(nm[i] != 0)
                for(int ii = i + 1; ii < count; ii++)
                    if(nm[ii] != 0 && nm[ii] % nm[i] == 0)
                        nm[ii] = 0;

        num = 0;
        for(int i = 0; i < count; i++)
            if(nm[i] != 0)
                nm[num++] = nm[i];
        if(num == 0)
            System.out.print("-1");
        else{
            for(int i = 0; i < num; i++)
                sum += nm[i];
        
            System.out.println(sum);
            System.out.print(nm[0]);
        }
    }
}
