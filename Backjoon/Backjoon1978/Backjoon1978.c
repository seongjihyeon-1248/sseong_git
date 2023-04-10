#include <stdio.h>

int main(){
    int N = 4;
    int n[4] = {1, 3, 5, 7};
    int count = N;

    for(int i = 0; i < N; i++){
        if(n[i] <= 1)
            count--;
        for(int ii = 2; ii < n[i]; ii++)
            if (n[i] % ii == 0){
                count--;
                break;
            }
    }
    printf("%d ", count);
}