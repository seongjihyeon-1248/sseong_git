package Backjoon2798;
public class Backjoon2798{
    public static void main(String args[]){
        int N = 5, M = 21, sum = 0, s;
        int[] n = new int[N];
        int[] mn = {5, 6, 7, 8, 9};
        for(int i = 0; i < N; i++)
            n[i] = mn[i];
        for(int i = 0; i < N - 2; i++)
            for(int ii = i + 1; ii < N - 1; ii++)
                for(int iii = ii + 1; iii < N; iii++){
                    s = n[i] + n [ii] + n[iii];
                    if(s <= M && s > sum)
                        sum = s;
                }
        System.out.print(sum);
    }
}