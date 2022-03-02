#include <stdio.h>

int main(){
    int N, cycle = -1;
    N = 26;
    int n = N;
    while(++cycle == 0 || n != N)
        n = (n % 10) * 10 + (n % 10 + n / 10) % 10;
    printf("%d", cycle);
    return 0;
}