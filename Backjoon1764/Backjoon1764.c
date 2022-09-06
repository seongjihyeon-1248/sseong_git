#include <stdio.h>
int main(){
    int N;
    N = 3;
    char **n = (char**)malloc(sizeof(char*) * N);
    for(int i = 0; i < N; i++)
        n[i] = (char*)malloc(sizeof(char) * 20);
    char* nn[3] = {"ohhenrie", "charlie", "baesangwook"};
    for(int i = 0; i < N; i++)
        strcpy(n[i], nn[i]);

    int M;
    M = 4;
    char **m = (char**)malloc(sizeof(char*) * M);
    for(int i = 0; i < M; i++)
        m[i] = (char*)malloc(sizeof(char) * 20);
    char* mm[4] = {"obama", "baesangwook", "ohhenrie", "clinton"};
    for(int i = 0; i < M; i++)
        strcpy(m[i], mm[i]);

    int*mn = (int*)malloc(sizeof(int) * N);

    int count = 0;
    
    for (int i = 0; i < N; i++)
        mn[i] = 0;
    for (int i = 0; i < N; i++){
        for (int ii = 0; ii < M; ii++)
            if (strcmp(n[i], m[ii]) == 0){
                mn[count] = i;
                count++;
                break;
            }
    }
    int temp;
    for (int i = 0; i < count - 1; i++)	{		
        for (int j = 0; j < count - 1 - i; j++)   {			
            if (strcmp(n[mn[j]], n[mn[j + 1]]) > 0)   {	
                temp = mn[j];						
                mn[j] = mn[j + 1];				
                mn[j + 1] = temp;			
            }		
        }	
    }
    printf("%d\n", count);

    for(int i = 0; i < count; i++)
        printf("%s\n", n[mn[i]]);
}