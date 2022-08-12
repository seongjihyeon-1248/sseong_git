#include <stdio.h>
#include <stdlib.h>



//버블 정렬
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



//삽입 정렬
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



//선택 정렬
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



//합병
void merge(int arr[], int left, int mid, int right) {
    int arrCopy[100], i = left, j = mid + 1, k = left;
    //arrCopy는 합병 결과를 저장할 배열
    //i값을 배열의 첫 번째 인덱스로 지정
    //j값을 배열의 mid + 1 인덱스로 지정
    //k값을 배열의 첫 번째 인덱스로 지정
    while(i <= mid && j <= right) {
    //i가 mid보다 작거나 같고, j가 마지막 값보다 작거나 같을 때
        if(arr[i] <= arr[j]) arrCopy[k++] = arr[i++];
        //i, j값을 비교해서 i의 값이 작으면 
        //i의 값을 결과 배열에 저장 후, k값을 1증가, i값을 1 증가
        else arrCopy[k++] = arr[j++];
        //아니면
        //j의 값을 결과 배열에 저장 후, k값을 1증가, j값을 1 증가
    }
    while(i<=mid) arrCopy[k++] = arr[i++]; 
    //왼쪽의 남은 배열을 모두 결과 배열에 저장
    while(j<=right) arrCopy[k++] = arr[j++];
    //오른쪽의 남은 배열을 모두 결과 배열에 저장
    for(int a = left; a <= right; a++) arr[a] = arrCopy[a];
    //기존 병렬에 합병 결과 배열을 저장
}
//합병 정렬(분할이라고 하는게 맞지 않을까...)
void mergeSort(int arr[], int left, int right) {
    int mid;
    if(left < right) {
        mid = (left+right)/2;           //mid값을 중간 인덱스 값으로 지정
        mergeSort(arr, left, mid);      //mid를 기준으로 왼쪽 합병 정렬 (재귀)
        mergeSort(arr, mid+1, right);   //mid를 기준으로 오른쪽 합병 정렬 (재귀)
        merge(arr, left, mid, right);   //mid를 기준으로 분할한 것을 합병
    }
}



//인덱스 값 서로 교환
void swap(int arr[], int a, int b){
    int temp =arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
}
//피봇을 배열의 첫 번째 값으로 정하고 그 피봇을 기준으로 작은 수는 왼쪽, 큰 수는 오른쪽에 정렬한 후, 피봇 값을 반환
int partition(int arr[], int left, int right){
    int pivot = arr[left], low = left + 1, high = right;
    //피봇을 배열의 첫 번째 값으로 지정
    //low값을 배열의 두 번째 인덱스로 지정
    //high값을 배열의 마지막 인덱스로 지정
    while(low <= high){
    //low가 high보다 작거나 같은 때
        while(low <= right && pivot >= arr[low]) 
        //low가 마지막 값보다 작고 피봇이 low 값보다 클 때
            low++;
            //low값을 오른쪽으로 한 칸 이동(low 1 증가)
        while(high >= (left + 1) && pivot <= arr[high]) 
        //high가 두 번째 값보다 크고 피봇이 high보다 작을 때
            high--;
            //high값을 왼쪽으로 한 칸 이동(high 1 감소)
        if(low <= high) 
        //low가 high보다 작거나 같으면
            swap(arr, low, high);
            //low의 값과 high의 값과 바꾼다.
    }
    swap(arr, left, high);
    return high;
}
//퀵 정렬
void quickSort(int arr[], int left, int right){
    if(left <= right){
        int pivot = partition(arr, left, right);    //피봇 값
        quickSort(arr, left, pivot - 1);            //피봇을 기준으로 왼쪽 퀵 정렬 (재귀)
        quickSort(arr, pivot + 1, right);           //피봇을 기준으로 오른쪽 퀵 정렬 (재귀)
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
    //mergeSort(n, 0, N-1);
    //quickSort(n, 0, N-1);

    for(int i = 0; i < N; i++)
        printf("%d\n", n[i]);
}