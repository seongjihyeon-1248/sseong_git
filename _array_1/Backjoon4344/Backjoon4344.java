package _array_1.Backjoon4344;

public class Backjoon4344 {
    public static void main(String args[]){
        int[] n = {5,50,50,70,80,100};
        int[] Nn = {0,0,0,0,0};
        double sum = 0.0, over = 0.0;
        for(int i = 1; i < n[0]; i++){
            sum += n[i];
            Nn[i-1] = n[i]; 
        }
        for(int i = 1; i < n[0]; i++){
            if(sum / n[0] < n[i])
                over += 1.0; 
        }
        System.out.print(over/n[0]*100 + "%");
    }
    
}
