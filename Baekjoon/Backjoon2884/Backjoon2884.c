#include <Stdio.h>

int main(){
    int H, M;
    H = 10;
    M = 10;
    if(M > 44)          printf("%d %d", H, M - 45);
    else {
        if(H == 0)      printf("23 %d", M + 15);
        else            printf("%d %d", H--, M + 15);
    }
    return 0;
}