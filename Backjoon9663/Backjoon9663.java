package Backjoon9663;

public class Backjoon9663 {
    static int count = 0;
    public static boolean isPromising(int[] q, int n) {
        for (int i = 0; i < n; i++) {
            if (q[i] == q[n]) return false;   // 같은 열인지
            if ((q[i] - q[n]) == (n - i)) return false;   // '\' 방향
            if ((q[n] - q[i]) == (n - i)) return false;   // '/' 방향
        }
        return true;
    }
    public static void enumerate(int N) {
        int[] a = new int[N];
        enumerate(a, 0);
    }
    public static void enumerate(int[] q, int n) {   //q[] -> 해당 인덱스 행에서 놓은 위치, n -> 채워진 행 개수
        int N = q.length;
        if (n == N) {       // n이 끝까지 돌았다면 카운트를 증가한다.
            count++;
        } else {
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (isPromising(q, n)) enumerate(q, n + 1);   // 유망하다면 계속 탐색(재귀호출)
            }
        }
    }
    public static void main(String[] args) {
        int N = 8;
        enumerate(N);
        System.out.println(count);
    }
}