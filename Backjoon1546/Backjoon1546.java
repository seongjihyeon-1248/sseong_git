package Backjoon1546;

public class Backjoon1546 {
    public static void main(String args[]){
        int N;
        double M = 0.0, average = 0.0;
        double[] n = {40.0, 80.0, 60.0};
        N = 3;
        int i = 0;
        for(i = 0; i < N; i++){
            average += n[i];
            if(i == 0)
                M = n[i];
            else
                if(M < n[i])
                    M = n[i];
        }
        System.out.print(average/N/M*100);
    }
    
}
