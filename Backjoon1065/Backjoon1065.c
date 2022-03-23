#include <stdio.h>

void Han_num(int n){
    int count = 0;
    int a[1001]; 

    for(int i = 1; i < 100; i++)
        a[i] = 1;

    for(int i = 100; i < 1000; i++)
        if((i % 10 + i / 100) == ((i % 100) / 10) * 2)
            a[i] = 1;
        else
            a[i] = 0;
        
    a[1000] = 0;

    for(int i = 1; i <= n; i++)
        if(a[i] == 1)
 
            count++; 
        
    printf("%d\n", count);
}

int main(){
    int N = 110;
    Han_num(N);
    return 0;
}