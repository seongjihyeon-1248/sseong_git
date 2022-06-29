#include <stdio.h>
#include <stdlib.h>

int main() {
    int N, sum = 0;
    N = 5;
    int Nn[5] = { 5,4,3,2,1 };
    int* n = (int*)malloc(sizeof(int) * N);
    for (int i = 0; i < N; i++)
        n[i] = Nn[i];
    for (int i = 0; i < N; i++)
        sum += n[i];
    printf("%d", sum);

    return 0;
}