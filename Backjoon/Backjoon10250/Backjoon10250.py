T = 2
h = [6, 30]
w = [12, 50]
n = [10, 72]
for i in range(0, T):
    print((n[i] % h[i]) * 100 + (n[i] + h[i] - 1) // h[i])
