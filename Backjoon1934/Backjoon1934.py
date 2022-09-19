T = 3
a = [1, 6, 13]
b = [45000, 10, 17]
A = list()
B = list()

for i in range(0, T):
    A.append(a[i])
    B.append(b[i])
    
for ii in range(0, T):
    if(A[ii] < B[ii]):
        max = B[ii]
    else:
        max = A[ii]
        
    i = 1
    while(1):
        if((max * i) % A[ii] == 0 and (max * i) % B[ii] == 0):
            print(max * i)
            break
        i += 1