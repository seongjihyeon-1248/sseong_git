N = 10
n = list()
nn = [6, 3, 2, 10, 10, 10, -10, -10, 7, 3]
for i in range(0, N):
    n.append(nn[i])
M = 8
m = list()
mm = [10, 9, -5, 2, 3, 4, 5, -10]
for i in range(0, M):
    m.append(mm[i])
    
count = 0

for i in range(0, M):
    count = 0
    for ii in range(0, N):
        if(m[i] == n[ii]):
            count += 1
    print(count, end=" ")