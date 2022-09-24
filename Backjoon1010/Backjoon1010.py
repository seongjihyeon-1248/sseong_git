T = 3
n = [2, 1, 13]
m = [2, 5, 29]
N = list()
M = list()
for i in range(0, T):
    if(m[i] - n[i] > n[i]):
        N.append(m[i] - n[i])
    else:
        N.append(n[i])
    N.append(n[i])
    M.append(m[i])

for i in range(0, T):
    nn = 1
    mm = 1
    for ii in range(N[i] + 1, M[i] + 1):
        nn *= ii
    for ii in range(2,  M[i] - N[i] + 1):
        mm *= ii
    print(nn / mm)