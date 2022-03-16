#include <stdio.h>

int main(){
    int N;
    float M = 0.0, average = 0.0;
    float n[3] = {40.0, 80.0, 60.0};
    N = 3;
    int i = 0;
    for(i = 0; i < N; i++){
        average += n[i];
        if(i == 0)
            M = n[i]; 
        else
            if(M < n[i])
                M = n[i];
    }
    printf("%f", average/N/M*100);
    return 0;
}