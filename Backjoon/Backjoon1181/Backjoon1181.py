N = 13
n = list()
mn = ['but','i', 'wont', 'hesitate', 'no', 'more', 'no', 'more', 'it', 'cannot', 'wait', 'im', 'yours']
for i in range(0, N):
    if(n.count(mn[i]) == 0):
        n.append(mn[i])
    
n.sort()
n.sort(key=len)    
    
for i in range(0, len(n)):
    print(n[i])