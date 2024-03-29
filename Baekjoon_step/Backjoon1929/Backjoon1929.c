#include <stdio.h>
#include <stdlib.h>

int main(){
    int M = 3;
    int N = 16;
    int num = N - M + 1;
    int*nm = (int*)malloc(sizeof(int) * (num));
    int count = 0;
    
    for(int i = 0; i < num; i++)
        nm[i] = i + M;

    if(nm[0] == 1) 
        nm[0] = 0;

    for(int i = 2; i < M; i++)
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
    
    for(int i = 0; i < num; i++)
        printf("%d\n", nm[i]);

}