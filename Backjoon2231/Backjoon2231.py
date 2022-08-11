N = 216
for i in range(1, N):
    temp = i
    num = i
    while(temp > 0):
        num += temp % 10
        temp //= 10
    if(num == N):
        print(i)
        N = 0
        break
if(N != 0):
    print("0")