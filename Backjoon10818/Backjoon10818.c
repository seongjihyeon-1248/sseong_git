#include <stdio.h>

int main(){
    int N = 5;
    int A[5] = {20, 10, 35, 30, 7};
    int max = A[0];
    int min = A[0];

    for (int i = 1; i < N; i++){
        if(max < A[i]) max = A[i];
        if(min > A[i]) min = A[i];
    }
    printf("%d %d", min, max);
}