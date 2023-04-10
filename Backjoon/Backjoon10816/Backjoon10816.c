#include <stdio.h>
int main(){
    int N;
    N = 10;
    int*n = (int*)malloc(sizeof(int) * N);
    int nn[10] = {6, 3, 2, 10, 10, 10, -10, -10, 7, 3};
    for(int i = 0; i < N; i++)
        n[i] = nn[i];
    int M;
    M = 8;
    int*m = (int*)malloc(sizeof(int) * M);
    int mm[8] = {10, 9, -5, 2, 3, 4, 5, -10};
    for(int i = 0; i < M; i++)
        m[i] = mm[i];
    
    int count = 0;

    for(int i = 0; i < M; i++){
        count = 0;
        for(int ii = 0; ii < N; ii++)
            if(m[i] == n[ii])
                count++;
        printf("%d ", count);
    }
}