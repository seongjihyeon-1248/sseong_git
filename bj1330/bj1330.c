#include <stdio.h>

int main(){
    int A, B;
    A = 1;
    B = 2;
    if(A < B)       printf("<");
    else if(A > B)  printf(">");
    else            printf("==");
    return 0;
}