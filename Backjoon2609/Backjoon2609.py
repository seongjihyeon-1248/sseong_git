A = 24
B = 18

if(A < B):
    min = A
    max = B
else:
    min = B
    max = A
    

while(min > 1):
    min -= 1
    if(A % min == 0 and B % min == 0):
        print(min)
        break


i = 1
while(1):
    if((max * i) % A == 0 and (max * i) % B == 0):
        print(max * i)
        break
    i += 1