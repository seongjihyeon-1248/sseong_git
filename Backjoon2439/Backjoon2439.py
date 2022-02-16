N = 5

for i in range(1, N + 1):
    for ii in range(i, N):
        print(" ", end="")
    for ii in range(0, i):
        print("*", end="")
    print()