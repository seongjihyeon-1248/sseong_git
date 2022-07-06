#include <stdio.h>
#include <string.h> 

int main(){
    char *a = "Mississipi";
    int alphabet[26];
    char *small = "abcdefghijklmnopqrstuvwxyz";
    char *big = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    for(int ii = 0; ii < 26; ii++)
        alphabet[ii] = 0;

    int i;
    for(i = 0; i < strlen(a); i++){
        for(int ii = 0; ii < 26; ii++){
            if(a[i] == small[ii] || a[i] == big[ii]){
                alphabet[ii]++;
                break;
            }
        }
    }

    i = 0;
    int same = 0;
    for(int ii = 1; ii < 26; ii++)
        if(alphabet[i] < alphabet[ii]){
            i = ii;
            same = 0;
        }
        else if (alphabet[i] == alphabet[ii])
            same = 1;

    if(same)
        printf("?");
    else
        printf("%c", big[i]);
}