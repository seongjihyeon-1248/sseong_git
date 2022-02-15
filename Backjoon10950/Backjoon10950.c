#include <stdio.h>

int main(){
    int T;
    int A[5] = {1, 2, 3, 9, 5};
    int B[5] = {1, 3, 4, 8, 2};
    T = 5;
    for(int i = 0; i < T; i++)
        printf("%d\n", A[i]+B[i]);
    return 0;
}