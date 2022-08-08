#include <Stdio.h>

int main(){
    int N = 10, f = 1;
    for(int i = N; i > 0; i--)
        f *= i;
    printf("%d", f);
}