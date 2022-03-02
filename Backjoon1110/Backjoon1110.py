cycle = 0
N = 26
n = N
while n != N or cycle == 0:
    n = (n % 10) * 10 + (n % 10 + n // 10) % 10
    cycle += 1
print(cycle)