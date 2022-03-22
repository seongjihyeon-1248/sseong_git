#include <stdio.h>

int main(){
    int n[6] = {5,50,50,70,80,100};
    int Nn[5];
    float sum = 0.0, over = 0.0;
    for(int i = 1; i < n[0]; i++){
        sum += n[i];
        Nn[i-1] = n[i]; 
    }
    for(int i = 1; i < n[0]; i++){
        if(sum / n[0] < n[i])
            over += 1.0; 
    }
    printf("%f%%", over/n[0]*100);
    return 0;
}