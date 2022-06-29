#include <stdio.h> 
#include <stdlib.h>

int main(){
    int a[10] = {1, 10, 4, 9, 2, 3, 8, 5, 7, 6};
    int N, X;
    N = 10;
    X = 5;
    int* A;
    A = (int*)malloc(sizeof(int));
    int i = 0;

    while(i++ < N)
        A[i] = a[i];

    i = 0;
    while(i++ < N)
        if(A[i] < X) printf("%d ", A[i]);

    return 0;
}