a  = [1, 10, 4, 9, 2, 3, 8, 5, 7, 6]
N = 10
X = 5
A = list()

i = 0
while(i < N):
    A.insert(i, a[i])
    i += 1

i = 0
while(i < N):
    if A[i] < X: print(A[i], end=' ')
    i += 1