#include <stdio.h>

int main(){
    int N = 2;
    int n[2] ={4, 2};
    int ii = 3;
    int iii;
    while(ii > 0){
        iii = 0;
        for(int i = 0; i < N; i++){
            if(ii % n[i] == 0 && ii != n[i])
                iii++;
            if(i + 1 == iii){
                printf("%d", ii);
                ii = -1;
            }
        }
        ii++;
    }
}