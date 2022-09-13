#include <stdio.h>

int main(){
    int T = 3;
    int x1[3] = {0, 0, 1};
    int y1[3] = {0, 0, 1};
    int r1[3] = {13, 3, 1};
    int x2[3] = {40, 0, 1};
    int y2[3] = {0, 7, 1};
    int r2[3] = {37, 4, 5};
    double r;
    for (int i = 0; i < T; i++){
        r = (x1[i] - x2[i]) * (x1[i] - x2[i]) + (y1[i] - y2[i]) * (y1[i] - y2[i]);
        if((r1[i] - r2[i]) * (r1[i] - r2[i]) < r && r < (r1[i] + r2[i]) * (r1[i] + r2[i]))
            printf("2\n");
        else if(r == (r1[i] - r2[i]) * (r1[i] - r2[i]) || r == (r1[i] + r2[i]) * (r1[i] + r2[i])){
            if(x1[i] == x2[i] && y1[i] == y2[i])
                printf("1\n");
            else 
                printf("1\n");
        }
        else
            printf("0\n");
    }
}