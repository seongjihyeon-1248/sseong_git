#include <stdio.h>
#include <stdlib.h>

int main(){
    int N = 26;
    int M = 5;
    char **n = (char**)malloc(sizeof(char*) * N);
    for(int i = 0; i < N; i++)
        n[i] = (char*)malloc(sizeof(char) * 20);
    char* nn[26] = {"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard", 
        "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", 
        "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot", 
        "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok",
        "Pikachu", "Raichu"};

    for (int i = 0; i < N; i++)
        strcpy(n[i], nn[i]);

    int *ran = (char**)malloc(sizeof(char*) * M);
        
    for(int i = 0;  i < M; i++){
        ran[i] = rand() % (2 * N - 1);
        if(ran[i] < N)
            printf("%s\n", n[ran[i]]);
        else
            printf("%d\n", ran[i] - N + 1);
    }

    for(int i = 0;  i < M; i++){
        if(ran[i] <  N){
            for(int ii = 0;  ii < N; ii++){
                if(n[ii] == n[ran[i]]){
                    printf("%d\n", ii);
                }
            }
        }
        else
            printf("%s\n", n[ran[i] - N]);
    }
}