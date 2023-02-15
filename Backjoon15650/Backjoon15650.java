package Backjoon15650;

public class Backjoon15650 {

    public static void main(String[] args) {
        int N = 3;
        int M = 1;
        boolean[] isUsed = new boolean[N + 1];
        int[] arr = new int[M];  

        new N_and_M_2().recursion(0, N, M, arr, isUsed);
    }
}

class N_and_M_2{
    public void recursion(int idx, int N, int M, int[] arr, boolean[] isUsed) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        int i = 1;
        if(idx > 0) i = arr[idx - 1];
        for (; i <= N; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                arr[idx] = i;
                recursion(idx + 1, N, M, arr, isUsed); 
                isUsed[i] = false;
            }
        }
    }
}