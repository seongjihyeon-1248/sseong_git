n = 100

nm = list(range(n, 2 * n + 1))
num = n + 1
sum = 0
count = 0

if(nm[0] == 1):
    nm[0] = 0
        
for i in range(2, n):
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

print(num)
    