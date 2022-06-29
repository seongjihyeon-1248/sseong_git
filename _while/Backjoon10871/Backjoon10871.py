a  = [1, 10, 4, 9, 2, 3, 8, 5, 7, 6]
N = 10
X = 5
A = list()

for i in range(0, N):
        A.insert(i, a[i])

for i in range(0, N):
    if A[i] < X: print(A[i], end=' ')