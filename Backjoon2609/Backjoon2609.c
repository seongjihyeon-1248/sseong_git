#include <stdio.h>

int main(){
    int A = 24;
    int B = 18;
    int min, min_2;
    if(A < B)
        min = A;
    else
        min = B;
    
    min_2 = min;

    while(--min > 1)
        if(A % min == 0 && B % min == 0){
            printf("%d\n", min);
            break;
        }

    for(int i = 1; ; i++){
        if((min_2 * i) % A == 0 && (min_2 * i) % B == 0){
            printf("%d", min_2 * i);
            break;
        }
    }
}