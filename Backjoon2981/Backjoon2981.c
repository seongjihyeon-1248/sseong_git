#include <stdio.h>
#include <stdlib.h>

int main(){
    int N = 3;
    int nn[3] = {6, 34, 38};
    int* n = (int*)malloc(sizeof(int) * N);
    int max = nn[0];
    for(int i = 0; i < N; i++){
        n[i] = nn[i];
        if(max < nn[i])
            max = nn[i];
    }
    for(int i = 2; i < max; i++)
        for(int ii = 0; ii < N - 1; ii++){
            if(n[ii] % i != n[ii + 1] % i)
                break;
            if(ii == N - 2)
                printf("%d ", i);
        }
}