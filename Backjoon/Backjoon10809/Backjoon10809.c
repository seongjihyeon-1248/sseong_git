#include <Stdio.h>

int main(){
    char alpa[26] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' ,'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    int num[26];
    char *S = "baekjoon";
    int i;
    for(i = 0; i < 26; i++)    
        num[i] = -1;
    i = -1;

    while (S[++i] != '\0')
        for(int ii = 0; ii < 26; ii++)
            if(alpa[ii] == S[i] && num[ii] == -1)
                num[ii] = i;

    for(i = 0; i < 26; i++)    
        printf("%d ", num[i]);
        
    return 0;
}