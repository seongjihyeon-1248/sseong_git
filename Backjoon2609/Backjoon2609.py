A = 24
B = 18

if(A < B):
    min = A
else:
    min = B
    
min_2 = min

while(min > 1):
    min -= 1
    if(A % min == 0 and B % min == 0):
        print(min)
        break


i = 1
while(1):
    if((min_2 * i) % A == 0 and (min_2 * i) % B == 0):
        print(min_2 * i)
        break
    i += 1