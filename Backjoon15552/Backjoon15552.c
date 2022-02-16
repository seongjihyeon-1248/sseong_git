#include <stdio.h>

int main(){
    int T;
    int A[5] = {1, 12, 5, 40, 1000};
    int B[5] = {1, 34, 500, 60, 1000};
    T = 5;
    for(int i = 0; i < T; i++)
        printf("%d\n", A[i]+B[i]);
    return 0;
}