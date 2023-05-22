N = 5
M = 21
sum = 0
n = list()
mn = [5, 6, 7, 8, 9]
for i in range(0, N):
    n.append(mn[i])
for i in range(0, N - 2):
    for ii in range(i + 1, N - 1):
        for iii in range(ii + 1, N):
            s = n[i] + n [ii] + n[iii]
            if(s <= M and s > sum):
                sum = s
print(sum)