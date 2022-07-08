N = 18
for i in range(0, (N // 3) + 1):
    for ii in range(0, (N // 5) + 1):
        if(i * 3 + ii * 5 == N):
            print(i + ii)
            i = -1
    if(i == -1):
        break
if(i != -1):
    print("-1")