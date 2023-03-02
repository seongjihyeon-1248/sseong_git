package Backjoon2447;

// 사실 제대로 이해하지 못해서 그냥 외움
import java.io.*;
class Backjoon2447{
    public static void starboxMaker(int row, int col, int N, BufferedWriter bw) throws IOException{
        //row를 N으로 나눴을 때의 나머지가 1이면 빈 공간임
        if ((row / N) % 3 == 1 && (col / N) % 3 == 1) {
            bw.write(" ");
        }
        else {
            //N이 3보다 작아지면 이제 row / N의 나머지가 1이 될 가능 성이 없으므로 *출력
            if (N < 3) {
                bw.write("*");
            }
            //N이 3보다 크면 N을 3으로 나누고 재귀문 반복
            else {
                starboxMaker(row, col, N / 3, bw);
            }
        }
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                starboxMaker(i, j, N, bw);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}