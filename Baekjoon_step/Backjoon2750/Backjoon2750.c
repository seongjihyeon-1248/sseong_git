#include <stdio.h>
#include <stdlib.h>

//시간 복잡도: O(N^2)

//버블 정렬 //6등(가장 느림)
void bubbleSort(int arr[], int n){
    int temp;
    for(int i = 0; i < n-1; i++)
    //n, n - 1, n -2... 정렬하는 방식
        for(int j = 0; j < n - 1 - i; j++)
        // 정렬 안 된 수까지 한 칸씩 비교하며 큰 수를 뒤로 작은 수를 앞으로 위치 변경
            if(arr[j] > arr[j + 1]) { 
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
}



//삽입 정렬 //4등
void insertSort(int arr[], int n){
    int j, temp;
    for(int i = 1; i < n; i++) {
    //0~1, 0~2, 0~3...정렬하는 방식
        temp = arr[i];
        //비교할 수를 temp로 지정
        for(j = i; j > 0 && arr[j-1] > temp; j--) arr[j] = arr[j-1];
        //temp가 자신의 앞 수보다 클 때까지 앞쪽으로 이동
        arr[j] = temp;
        //이동이 끝나면 끝난 자리에 temp로 지정
    }
}



//선택 정렬 //5등
void selectionSort(int arr[], int n){
    int min, temp;
    for(int i = 0; i < n; i++) {
        min = i;
        //정렬 안 된 첫 인덱스를 최소로 함
        for(int j = i; j < n; j++) 
            if(arr[j] < arr[min]) 
            //기존의 최소보다 작으면
                min = j;
                //해당 인덱스의 값을 최소로 지정
        temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        //정렬 안 된 첫 값과 최소 값의 위치를 교환
    }
}

int main(){
    int N = 5;
    int*n = (int*)malloc(sizeof(int) * N);
    int mn[5] = {5, 4, 3, 2, 1};
    for(int i = 0; i < N; i++)
        n[i] = mn[i];

    //bubbleSort(n, N);
    //insertSort(n, N);
    //selectionSort(n, N);

    for(int i = 0; i < N; i++)
        printf("%d\n", n[i]);
}