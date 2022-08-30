#include <stdio.h>
#include <string.h>

int main(){	
    int N = 13;
    char **n = (char**)malloc(sizeof(char*) * N);
    for(int i = 0; i < N; i++)
        n[i] = (char*)malloc(sizeof(char) * 50);
    char* mn[13] = {"but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im", "yours"};	
    int* len = (int*)malloc(sizeof(char*) * N);
    char *tmp[50];
    int temp;
    for (int i = 0; i < N; i++){
        strcpy(n[i], mn[i]);
        len[i] = strlen(mn[i]);
    }
    for (int i = 0; i < N - 1; i++)	{		
        for (int j = 0; j < N - 1 - i; j++)   {			
            if (strcmp(n[j], n[j + 1]) > 0)   {	
                temp = len[j];
                len[j] = len[j + 1];
                len[j + 1] = temp;			
                strcpy(tmp, n[j]);				
                strcpy(n[j], n[j + 1]);				
                strcpy(n[j + 1], tmp);			
            }		
        }	
    }
     for (int i = 0; i < N - 1; i++)	{		
        for (int j = 0; j < N - 1 - i; j++)   {	
            if (len[j] > len[j + 1])   {				
                strcpy(tmp, n[j]);				
                strcpy(n[j], n[j + 1]);				
                strcpy(n[j + 1], tmp);			
            }		
        }	
    }
    for (int i = 0; i < N; i++){
        printf("%s\n", n[i]);
    }	
}
