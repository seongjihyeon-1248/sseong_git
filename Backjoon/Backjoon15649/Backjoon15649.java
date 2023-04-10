package Backjoon15649;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon15649 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] isUsed = new boolean[N + 1];
        int[] arr = new int[M];

        new N_and_M_1().recursion(0, N, M, arr, isUsed);
    }
}

class N_and_M_1{
    public void recursion(int idx, int N, int M, int[] arr, boolean[] isUsed) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                arr[idx] = i;
                recursion(idx + 1, N, M, arr, isUsed); 
                isUsed[i] = false;
            }
        }
    }
}