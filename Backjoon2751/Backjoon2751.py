N = 5
n = list()
mn = [5, 4, 3, 2, 1]
for i in range(0, N):
    n.append(mn[i])
    
n.sort()    
    
for i in range(0, N):
    print(n[i])