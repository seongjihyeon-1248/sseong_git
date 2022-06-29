alpa = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm' ,'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
num = []
S = "baekjoon"
for i in range(0, 26): 
        num.append(-1)
i = -1

for i in range(0, len(S)):
    for ii in range(0, 26): 
        if(alpa[ii] == S[i] and num[ii] == -1):
            num[ii] = i

for i in range(0, 26):    
    print(num[i], end=" ")