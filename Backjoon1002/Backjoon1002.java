package Backjoon1002;

public class Backjoon1002{
    public static void main(String args[]){
        int T = 3;
        int[] x1 = {0, 0, 1};
        int[] y1 = {0, 0, 1};
        int[] r1 = {13, 3, 1};
        int[] x2 = {40, 0, 1};
        int[] y2 = {0, 7, 1};
        int[] r2 = {37, 4, 5};
        double r;
        for (int i = 0; i < T; i++){
            r = Math.pow((x1[i] - x2[i]), 2) + Math.pow((y1[i] - y2[i]), 2);
            if(Math.pow((r1[i] - r2[i]), 2) < r && r < Math.pow((r1[i] + r2[i]), 2))
                System.out.println("2");
            else if(r == Math.pow((r1[i] + r2[i]),2) || r == Math.pow((r1[i] - r2[i]), 2)){
                if(x1[i] == x2[i] && y1[i] == y2[i])
                    System.out.println("1");
                else 
                    System.out.println("1");
            }
            else
                System.out.println("0");
        }
    }
}