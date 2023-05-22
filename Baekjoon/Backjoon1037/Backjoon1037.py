N = 2
n = [4, 2]
ii = 3
while(ii > 0):
    for i in range(0, N):
        if(ii % n[i] != 0):
            break
        if(i == N - 1 and ii != max(n)):
            print(ii)
            ii = -1
    ii += 1