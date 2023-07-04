#include <stdio.h>

int main(){
    int A[5] = {1, 2, 3, 9, 5};
    int B[5] = {1, 3, 4, 8, 2};
    int i = 0;
    while(i < 5)
        printf("%d\n", A[i] + B[i++]);
    return 0;
}