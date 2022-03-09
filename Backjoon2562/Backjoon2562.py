n = [3,29,38,12,57,74,40,85,61]
Nn = list()
for i in range(0,9):
    Nn.append(n[i])
print(max(Nn))
print(Nn.index(max(Nn))+1)