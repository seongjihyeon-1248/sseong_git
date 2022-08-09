#include <stdio.h>
#include <stdlib.h>
#include <string.h> 

void ber(int n){
    int num = n;
    int*nm = (int*)malloc(sizeof(int) * (num));
    int count = 0;
    
    for(int i = 1; i < num; i++)
        nm[i] = i + n;

    if(nm[0] == 1) 
        nm[0] = 0;

    for(int i = 2; i < n; i++)
        for(int ii = 0; ii < num; ii++)
            if(nm[ii] != 0 && nm[ii] % i == 0) 
                nm[ii] = 0;

    for(int i = 0; i < num; i++)
        if(nm[i] != 0)
            nm[count++] = nm[i];

    for(int i = 0; i < count; i++)
        if(nm[i] != 0)
            for(int ii = i + 1; ii < count; ii++)
                if(nm[ii] != 0 && nm[ii] % nm[i] == 0)
                    nm[ii] = 0;

    num = 0;
    for(int i = 0; i < count; i++)
        if(nm[i] != 0)
            nm[num++] = nm[i];

    printf("%d\n", num);
}

int main(){
    int n [100] = {1, 10, 13, 100, 1000, 10000, 100000};
    int count = 7;
    for(int i = 0; i < count; i++)
        ber(n[i]);
}