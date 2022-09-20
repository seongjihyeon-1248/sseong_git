N = 3
n = [6, 34, 38]

for i in range(2, max(n) + 1):
    for ii in range(0, N - 1):
        if(n[ii] % i != n[ii + 1] % i):
            break
        if(ii == N - 2):
            print(i, end=" ")