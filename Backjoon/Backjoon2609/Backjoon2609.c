#include <stdio.h>

int gcd(int num1, int num2){
    if(num2 == 0) return num1;
    else return gcd(num2, num1 % num2);
}

int main(){
    int A = 24;
    int B = 18;
    int g = gcd(A, B);
    printf("%d\n", g);
    printf("%d", A * B / g);
}