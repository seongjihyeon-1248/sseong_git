package Backjoon10818;

public class Backjoon10818 {
    public static void main(String args[]){
        int N, min = 0, max = 0;
        N = 5;
        int[] n = {20,10,35,30,7};
        for(int i = 0; i < N; i++){
            if(i == 0){
                min = n[i];
                max = n[i];
            } 
            else{
                if(min > n[i]) 
                    min = n[i];
                if(max < n[i])
                    max = n[i];
            }
        }
        System.out.print(min+" "+max);
    }
    
}
