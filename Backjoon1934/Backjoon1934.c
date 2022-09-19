#include <stdio.h>
#include <stdlib.h>

int main(){
    int T = 3;
    int a[3] = {1, 6, 13};
    int b[3] = {45000, 10, 17};
    int* A = (int*)malloc(sizeof(int) * T);
    int* B = (int*)malloc(sizeof(int) * T);
    for(int i = 0; i < T; i++){
        A[i] = a[i];
        B[i] = b[i];
    }
    int max;
    for(int ii = 0; ii < T; ii++){
        if(A[ii] < B[ii])
            max = B[ii];
        else
            max = A[ii];

        for(int i = 1; ; i++){
            if((max * i) % A[ii] == 0 && (max * i) % B[ii] == 0){
                printf("%d\n", max * i);
                break;
            }
        }
    }
           
}