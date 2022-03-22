N = 3
n = [40.0, 80.0, 60.0]
Nn = list()
sum = 0
for i in range(0,N):
    Nn.append(n[i])
    sum += n[i]
print(sum/N/max(Nn)*100)