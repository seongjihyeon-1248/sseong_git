M = 0.0 
average = 0.0
n = [40.0, 80.0, 60.0]
N = 3
i = 0
for i in range(0,N):
    average += n[i]
    if(i == 0):
           M = n[i]; 
    else:
        if(M < n[i]):
            M = n[i]
print(average/N/M*100)