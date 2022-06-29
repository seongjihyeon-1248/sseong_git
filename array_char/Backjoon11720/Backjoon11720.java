package array_char.Backjoon11720;
import java.util.*;

public class Backjoon11720 {
    public static void main(String args[]){
        int N, sum = 0;
        N = 5;
        int[] Nn = { 5,4,3,2,1 };
        ArrayList<Integer> n = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)
            n.add(Nn[i]);
        for (int i = 0; i < N; i++)
            sum += n.get(i);
        System.out.print(sum);
    }
}
