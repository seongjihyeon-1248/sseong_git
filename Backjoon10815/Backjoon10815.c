#include <stdio.h>
#include <stdlib.h>

int main(){
    int N = 5;
    int nn[5] = {6, 3, 2, 10, -10};
    int*n = (int*)malloc(sizeof(int) * N);
    for(int i = 0; i < N; i++)
        n[i] = nn[i];
    int M = 8;
    int mm[8] = {10, 9, -5, 2, 3, 4, 5, -10};
    int*m = (int*)malloc(sizeof(int) * M);
    for(int i = 0; i < M; i++)
        m[i] = mm[i];
    int yes = 0;
    for (int i = 0; i < M; i++){
        for (int ii = 0; ii < N; ii++){
            if(n[ii] == m[i])
                yes = 1;
        }
        if(yes == 1){
            printf("1 ");
            yes = 0;
        }
        else
            printf("0 ");
    }    
}