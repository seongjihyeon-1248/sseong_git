#include <stdio.h>

int main(){
    int T = 2;
    int h[2] = {6, 30};
    int w[2] = {12, 50};
    int n[2] = {10, 72};
    for(int i = 0; i < T; i++)
        printf("%d\n", (n[i] % h[i]) * 100 + (n[i] + h[i] - 1) / h[i]);
}