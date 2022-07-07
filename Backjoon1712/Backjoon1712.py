A = 2100000000
B = 9
C = 10
i = 0
if(B > C):
    print("-1")
else:
    while(1):
        if(A < (C - B) * i):
            break
        i += 1
    print(i)