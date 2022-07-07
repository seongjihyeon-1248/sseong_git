#include <stdio.h>

int main(){
    int A = 2100000000, B = 9, C = 10;
    int i = 0;
    if(B > C)
        printf("-1");
    else{
        while(1){
            if(A < (C - B) * i)
                break;
            i++;
        }
        printf("%d", i);
    }
}