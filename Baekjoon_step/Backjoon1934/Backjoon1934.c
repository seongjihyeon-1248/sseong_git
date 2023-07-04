#include <stdio.h>
#include <stdlib.h>

int gcd(int num1, int num2){
    if(num2 == 0) return num1;
    else return gcd(num2, num1 % num2);
}

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
    for(int i = 0; i < T; i++)
        printf("%d\n", (A[i] * B[i]) / gcd(A[i], B[i]));
}