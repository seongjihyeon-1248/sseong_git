def gcd(num1, num2):
    if(num2 == 0):
        return num1
    else: 
        return gcd(num2, num1 % num2)

T = 3
a = [1, 6, 13]
b = [45000, 10, 17]
A = list()
B = list()

for i in range(0, T):
    A.append(a[i])
    B.append(b[i])
    
for i in range(0, T):
    print(format((A[i] * B[i]) / gcd(A[i], B[i]), ".0f"))