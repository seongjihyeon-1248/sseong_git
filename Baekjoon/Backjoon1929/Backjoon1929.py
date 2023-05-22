M = 3
N = 16

nm = list(range(M, N + 1))
num = N - M + 1
count = 0

if(nm[0] == 1):
    nm[0] = 0
        
for i in range(2, M):
    for ii in range(0, num):
        if(nm[ii] != 0 and nm[ii] % i == 0):
            nm[ii] = 0

for i in range(0, num):
    if(nm[i] != 0):
        nm[count] = nm[i]
        count += 1

for i in range(0, count):
    if(nm[i] != 0):
        for ii in range(i + 1, count):
            if(nm[ii] != 0 and nm[ii] % nm[i] == 0):
                nm[ii] = 0

num = 0
for i in range(0, count):
    if(nm[i] != 0):
        nm[num] = nm[i]
        num += 1
            
for i in range(0, num):
    print(nm[i])