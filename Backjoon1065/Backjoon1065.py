def Han_num(n):
    count = 0
    a = list()
    for i in range(1, 100):
        a.append(1)

    for i in range(100, 1000):
        if((i % 10 + i / 100) == ((i % 100) / 10) * 2):
            a.append(1)
        else:
            a.append(0)
        
    a.append(0)

    for i in range(0, n):
        if(a[i] == 1):
            count = count + 1 
        
    print(count)

N = 110
Han_num(N)