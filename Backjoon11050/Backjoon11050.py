N = 5
K = 2 
n = N
k = N - K
for i in range(K + 1, N):
    n *= i
for i in range(2,  N - K):
    k *= i
print(n / k)