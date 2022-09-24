#include <stdio.h>
#include <stdlib.h>
int main(){
    int T = 3;
    int n[3] = {2, 1, 13}; 
    int m[3] = {2, 5, 29};
    int* N = (int*)malloc(sizeof(int) * T);
    int* M = (int*)malloc(sizeof(int) * T);
    for(int i = 0; i < T; i++){
        if(m[i] - n[i] > n[i])
            N[i] = m[i] - n[i];
        else
            N[i] = n[i];
        M[i] = m[i];
    }
    long long nn, mm;
    for(int i = 0; i < T; i++){
        nn = 1;
        mm = 1;
        for(int ii = N[i] + 1; ii <= M[i]; ii++){
            nn *= ii;
        }
        for(int ii = 2; ii <= M[i] - N[i] ; ii++)
            mm *= ii;
        printf("%d\n", nn / mm);
    } 
}