#include <stdio.h>

int main(){
    int N = 18;
    int i, ii;
    for(i = 0; i <= (N / 3); i++){
        for(ii = 0; ii <= (N / 5); ii++)
            if(i * 3 + ii * 5 == N){
                printf("%d", i + ii);
                i = -1;
            }
        if(i == -1)
            break;
    }
    if(i != -1)
        printf("-1");
}