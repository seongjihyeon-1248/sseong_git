N = 4
n = [1, 3, 5, 7]
count = N

for i in range(0, N):
    if(n[i] <= 1):
        count -= 1
    for ii in range(2, n[i]):
        if (n[i] % ii == 0):
            count -= 1
            break
print(count)