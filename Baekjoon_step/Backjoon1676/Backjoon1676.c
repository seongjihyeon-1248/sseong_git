#include <stdio.h>

int main(){
    int N = 10;
    int count = 0;
    while (N >= 5){
        count += N / 5;
        N /= 5;
    }
    printf("%d", count);
}