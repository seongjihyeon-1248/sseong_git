#include <stdio.h>

int main(){
    int N = 5;
    int K = 2;
    if(N - K > K)
        K = N - K; 
    int n = N;
    int k = N - K;
    for(int i = K + 1; i < N; i++)
        n *= i;
    for(int i = 2; i < N - K; i++)
        k *= i;
    printf("%d", (n / k) % 10007);  
}