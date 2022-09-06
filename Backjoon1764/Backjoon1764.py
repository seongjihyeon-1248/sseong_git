N = 3
n = list()
nn = ["ohhenrie", "charlie", "baesangwook"]
for i in range(0, N):
    n.append(nn[i])

M = 4
m = list()
mm = ["obama", "baesangwook", "ohhenrie", "clinton"]
for i in range(0, M):
    m.append(mm[i])

mn = list(set(n) & set(m))

print(len(mn))
mn.sort()

for i in mn:
    print(i)
