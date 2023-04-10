N = 5
K = 2
if(N - K > K):
    K = N - K
n = N
k = N - K
for i in range(K + 1, N):
    n *= i
for i in range(2,  N - K):
    k *= i
print((n / k) % 10007)