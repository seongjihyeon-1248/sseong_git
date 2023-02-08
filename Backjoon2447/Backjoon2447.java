package Backjoon2447;

// 사실 제대로 이해하지 못해서 그냥 외움

class Backjoon2447{
    public static void starboxMaker(int row, int col, int N){
        //row를 N으로 나눴을 때의 나머지가 1이면 빈 공간임
        if ((row / N) % 3 == 1 && (col / N) % 3 == 1) {
            System.out.print(" ");
        }
        else {
            //N이 3보다 작아지면 이제 row / N의 나머지가 1이 될 가능 성이 없으므로 *출력
            if (N < 3) {
                System.out.print("*");
            }
            //N이 3보다 크면 N을 3으로 나누고 재귀문 반복
            else {
                starboxMaker(row, col, N / 3);
            }
        }
    }
    public static void main(String args[]){
        int N = 27;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                starboxMaker(i, j, N);
            }
            System.out.println("");
        }
    }
}