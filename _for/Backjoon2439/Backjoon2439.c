#include <stdio.h>

int main(){
    int N;
    N = 5;

    for(int i = 1; i < N + 1; i++){
        for(int ii = i; ii < N; ii++)
            printf(" ");
        for(int ii = 0; ii < i; ii++)
            printf("*");
        printf("\n");
    }

    return 0;
}