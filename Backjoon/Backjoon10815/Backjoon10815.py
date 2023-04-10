N = 5
nn = [6, 3, 2, 10, -10]
n = list()
for i in range(0, N):
    n.append(nn[i])
M = 8
mm = [10, 9, -5, 2, 3, 4, 5, -10]
m = list()
for i in range(0, M):
    m.append(mm[i])
for i in range(0, M):
    if m[i] in n:
        print("1", end=' ')
    else:
        print("0", end=' ')