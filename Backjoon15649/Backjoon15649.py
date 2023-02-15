def recursion(idx, N, M, arr, isUsed):
    if (idx == M):
        for i in arr:
            print(i, end=" ")
        print()
        return
    if(idx > 0): I = arr[idx - 1]
    else:        I = 1
    for i in range(I, N + 1):
        if (isUsed[i] == 0):
            isUsed[i] = 1
            arr.append(i)
            recursion(idx + 1, N, M, arr, isUsed); 
            isUsed[i] = 0
            arr.pop()

N = 4
M = 2
isUsed = list()
arr = list()
for i in range(0, N + 1):
    isUsed.append(0)
recursion(0, N, M, arr, isUsed)