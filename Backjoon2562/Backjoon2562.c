#include <Stdio.h>

int main(){
    int MAX, max;
    int n[9] = {3,29,38,12,57,74,40,85,61};
    for(int i = 0; i < 9; i++){
        if(i == 0){
            MAX = i;
            max = n[i];
        } 
        else{
            if(max < n[i]){
                MAX = i;
                max = n[i];
            }
        }
    }
    printf("%d\n", max);
    printf("%d", MAX + 1);
    return 0;
}