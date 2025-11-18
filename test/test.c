#include <stdio.h>
#include <math.h>  // ceil 関数使用

int main() {
    // 最小回数を求める前提で進める

    int N, M, R, R_GOAL;    // 現在のゲーム回数 N、勝利回数 M、勝率 R、目標勝率 R_GOAL
    int X;            // 必要な勝利数   
    int R_DELTA = 1;  // 上げたい勝率の差分
    // 入力
    do {
        printf("現在のゲーム回数 N を入力してください: ");
        N=99;

        printf("現在の勝利回数 M を入力してください: ");
        M=49;

        if(M > N) {
            printf("勝利回数がゲーム回数を超えています。もう一度入力してください。\n");
        }
    } while(M > N);

    // 勝率を計算（小数点切り捨て）
    R = (M * 100) / N;

    R_GOAL = R + R_DELTA;

    // 勝率を1%上げるために必要なゲーム数を計算
    if(R >= 99) {
        printf("これ以上勝率を上げることはできません。\n");
        // R == 99 の場合、いくら勝っても100%にはならない
        // R == 100 の場合、100%以上に勝率を上げることは不可能
    } else {
        X = (int)ceil((R_GOAL * N - 100 * M) / (double)(100 - R_GOAL));
       printf("必要な勝利数: %d\n", X);
    }
    return 0;
}
