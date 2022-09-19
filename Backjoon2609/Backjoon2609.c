#include <stdio.h>

int main(){
    int A = 24;
    int B = 18;
    int min, max;
    if(A < B){
        min = A;
        max = B;
    }
    else{
        min = B;
        max = A;
    }

    while(--min > 1)
        if(A % min == 0 && B % min == 0){
            printf("%d\n", min);
            break;
        }

    for(int i = 1; ; i++){
        if((max * i) % A == 0 && max * i % B == 0){
            printf("%d", max * i);
            break;
        }
    }
}