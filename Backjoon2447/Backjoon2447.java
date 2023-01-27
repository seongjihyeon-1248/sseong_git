package Backjoon2447;

class Backjoon2447{
    public static void starboxMaker(int row, int col, int N){
        if ((row / N) % 3 == 1 && (col / N) % 3 == 1) {
            System.out.print(" ");
        }
        else {
            if (N / 3 == 0) {
                System.out.print("*");
            }
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