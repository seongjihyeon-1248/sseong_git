#include <stdio.h>
int main(){
    int x = 161;
    int y = 181;
    int w = 762;
    int h = 375;

    int min = x;

    if(min > y)
        min = y;
    
    if(min > w - x)
        min = w - x;
    
    if(min > h - y)
        min = h - y;

    printf("%d", min);
}