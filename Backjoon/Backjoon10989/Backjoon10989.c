#include <stdio.h>
#include <stdlib.h>

//시간 복잡도: O(NlogN) 

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
//합병 정렬(분할이라고 하는게 맞지 않을까...) //2등
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
//퀵 정렬 //1등(가장 빠름)
void quickSort(int arr[], int left, int right){
    if(left <= right){
        int pivot = partition(arr, left, right);    //피봇 값
        quickSort(arr, left, pivot - 1);            //피봇을 기준으로 왼쪽 퀵 정렬 (재귀)
        quickSort(arr, pivot + 1, right);           //피봇을 기준으로 오른쪽 퀵 정렬 (재귀)
    }
}


void heapify(int arr[], int here, int size) {
    int left = here * 2 + 1;
    //here의 왼쪽 자식
    int right = here * 2 + 2;
    //here의 오른쪽 자식
    int max = here;
    //최대는 임의로 here(삽입하는 곳)
    if (left < size && arr[left] > arr[max])
    //왼쪽 자식이 size보다 작아서 존재 하며, here보다 왼쪽 자식이 더 크면 
        max = left;
        //최대는 left
    if (right < size && arr[right] > arr[max])
    //오른쪽 자식이 size보다 작아서 존재 하며, here보다 오른쪽 자식이 더 크면 
        max = right;
        //최대는 right (here의 자리보다 left값, right값이 클 때는 최대가 right로 지정되므로 )
    if (max != here) {
        //최대가 기존의 here 자리가 아니면 
        swap(arr, here, max);
        //변경된 자리의 수와 위치 변경
        heapify(arr, max, size);
        //변경된 자식의 자식들도 정렬
    }
} 
//힙 정렬 //3등
void heapSort(int arr[], int size) {
    for (int i = size / 2 - 1; i >= 0; i--) 
    //잎이 아닌 노드까지 내림차순으로 정렬
        heapify(arr, i, size);
    for (int treeSize = size - 1; treeSize >= 0; treeSize--) {
    //잎들 꼭대기 노드에 놓고 정렬
        swap(arr, 0, treeSize);
        heapify(arr, 0, treeSize);
    }
}



int main(){
    int N = 10;
    int*n = (int*)malloc(sizeof(int) * N);
    int mn[10] = {5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
    for(int i = 0; i < N; i++)
        n[i] = mn[i];

    //mergeSort(n, 0, N-1);
    //quickSort(n, 0, N-1);
    //heapSort(n, N);

    for(int i = 0; i < N; i++)
        printf("%d\n", n[i]);
}