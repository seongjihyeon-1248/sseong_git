from collections import Counter
N = 5
n = []
n.append(1)
n.append(3)
n.append(8)
n.append(-2)
n.append(2)
counter_n = Counter(n).most_common()
Max_n = counter_n[0][1]
max_n = []
for num in counter_n:
    if num[1] == Max_n:
        max_n.append(num[0])
print(int(sum(n) / N + 0.5))
n.sort()
print(n[N // 2])
if(len(max_n) > 1):
    max_n.sort()
    print(max_n[1])
else:
    print(max_n)
print(max(n) - min(n))