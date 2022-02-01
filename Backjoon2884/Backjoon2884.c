#include <Stdio.h>

int main(){
    int H, M;
    H = 23;
    M = 40;
    if(M > 45) M -= 45;
    else {
        M += 15;
        if(H == 0) H = 23;
        else H--;
    }
    printf("%d %d", H, M);
    return 0;
}