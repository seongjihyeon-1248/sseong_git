#include <stdio.h>

int main(){
    int T = 5;
    int A[5] = {1, 12, 5, 40, 1000};
    int B[5] = {1, 34, 500, 60, 1000};

    int i = 0;
    while(i < T)
        printf("%d\n", A[i] + B[i++]);
}