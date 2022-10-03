#include <stdio.h>
#include <stdlib.h>

int count = 0;

int isPromising(int* q, int n) { 
    for (int i = 0; i < n; i++) {
        if (q[i] == q[n]) return 0;   // 같은 열인지
        if ((q[i] - q[n]) == (n - i)) return 0;   // '\' 방향
        if ((q[n] - q[i]) == (n - i)) return 0;   // '/' 방향
    }
    return 1;
}
void enumerate(int* q, int n, int N) { //q[] -> 해당 인덱스 행에서 놓은 위치, n -> 채워진 행 개수
    if (n == N)       // n이 끝까지 돌았다면 카운트를 증가한다.
        count++;
    else 
        for (int i = 0; i < N; i++) {
            q[n] = i; 
            if (isPromising(q, n) == 1) enumerate(q, n + 1, N);   // 유망하다면 계속 탐색(재귀호출)
        }
}

int main(){
    int N = 8;
    int*q = (int*)malloc(sizeof(int) * N);
    enumerate(q, 0, N);
    printf("%d", count);
}