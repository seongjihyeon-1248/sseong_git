#include <Stdio.h>

int fac(int n){
    if(n == 1)
        return 1;
    return n * fac(n - 1);
}

int main(){
    int N = 10;
    printf("%d", fac(N));
}