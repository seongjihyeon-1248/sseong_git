#include <stdio.h>
#include <stdlib.h>

void recursion(int idx, int N, int M, int* arr, int* isUsed) {
        if (idx == M) {
            for (int i = 0; i < M; i++) {
                printf("%d ", arr[i]);
            }
            printf("\n");
            return;
        }
        int i = 1;
        if(idx > 0) i = arr[idx - 1];
        for (; i <= N; i++) {
            if (isUsed[i] == 0) {
                isUsed[i] = 1;
                arr[idx] = i;
                recursion(idx + 1, N, M, arr, isUsed); 
                isUsed[i] = 0;
            }
        }
    }

int main(){
    int N = 4;
    int M = 2;
    int*isUsed = (int*)malloc(sizeof(int) * (N + 1));
    int*arr = (int*)malloc(sizeof(int) * M);
    for (int i = 0; i <= N; i++){
         isUsed[i] = 0;
    }
    recursion(0, N, M, arr, isUsed);
}