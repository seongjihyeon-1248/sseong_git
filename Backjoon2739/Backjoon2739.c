#include <Stdio.h>

int main(){
    int N;
    N = 2;
    for(int i = 1; i < 10; i++){
        printf("%d * %d = %d\n", N, i, N * i);
    }
    return 0;
}