#include <stdio.h> 
#include <stdlib.h>

int main(){
    int a[10] = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};
    int N, X;
    N = 10;
    X = 5;
    int* A;
    A = (int*)malloc(sizeof(int));

    for(int i = 0; i < N; i++)
        A[i] = a[i];

    for(int i = 0; i < N; i++)
        if(A[i] < X) printf("%d ", A[i]);

    return 0;
}