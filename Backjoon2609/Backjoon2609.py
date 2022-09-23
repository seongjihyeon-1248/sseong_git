def gcd(num1, num2):
    if(num2 == 0):
        return num1
    else: 
        return gcd(num2, num1 % num2)


A = 24
B = 18
gcd = gcd(A, B)
print(gcd)
print(format(A * B / gcd, ".0f"))