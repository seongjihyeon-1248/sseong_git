N = 10
n = list()
mn = [5, 2, 3, 1, 4, 2, 3, 5, 1, 7]
for i in range(0, N):
    n.append(mn[i])
    
n.sort()    
    
for i in range(0, N):
    print(n[i])