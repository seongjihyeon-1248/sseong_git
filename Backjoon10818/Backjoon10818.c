#include <stdio.h>

int main(){
    int N, min, max;
    N = 5;
    int n[5] = {20,10,35,30,7};
    for(int i = 0; i < N; i++){
        if(i == 0){
            min = n[i];
            max = n[i];
        } 
        else{
            if(min > n[i]) 
                min = n[i];
            if(max < n[i])
                max = n[i];
        }
    }
    printf("%d %d", min, max);
    return 0;
}