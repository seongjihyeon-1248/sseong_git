#include <stdio.h>

int main(){
    int list[4][3] = {{6, 8, 10}, {25, 52, 60}, {5, 12, 13}, {0, 0, 0}};
    int i = 0;
    int temp;
    while(1){
        if(list[i][0] > list[i][1]){
            temp = list[i][0];
            list[i][0] = list[i][1];
            list[i][1] = temp;
        }
        if(list[i][1] > list[i][2]){
            temp = list[i][1];
            list[i][1] = list[i][2];
            list[i][2] = temp;
        }
        if(list[i][0] * list[i][0] + list[i][1] * list[i][1] == list[i][2] * list[i][2]){
            if(list[i][2] == 0)
                break;
            printf("right\n");
        }
        else
            printf("wrong\n");
        i++;
    }
}