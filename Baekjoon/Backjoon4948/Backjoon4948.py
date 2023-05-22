def ber(n): 
    nm = list(range(n + 1, 2 * n + 1))
    num = n 
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

n = list()

n.append(1)
n.append(10)
n.append(13)
n.append(100)
n.append(1000)
n.append(10000)
n.append(100000)

for i in n:
    ber(i)