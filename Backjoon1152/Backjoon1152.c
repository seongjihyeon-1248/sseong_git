#include <stdio.h>
#include <string.h>

int main(){
    char* list = "The Curious Case of Benjamin Button";
    int count = 1;
    for(int i = 0; i < strlen(list); i++)
        if(list[i] == ' ')
            count++;
    printf("%d", count);
}