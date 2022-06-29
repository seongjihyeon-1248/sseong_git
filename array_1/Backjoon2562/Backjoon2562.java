package array_1.Backjoon2562;

public class Backjoon2562 {
    public static void main(String args[]){
        int max = 0, MAX = 0;
        int[] n = {3,29,38,12,57,74,40,85,61};
        for(int i = 0; i < 9; i++){
            if(i == 0){
                MAX = i;
                max = n[i];
            } 
            else{
                if(max < n[i]){
                    MAX = i;
                    max = n[i];
                }
            }
        }
        System.out.println(max);
        System.out.print(MAX + 1);
    }
    
}
