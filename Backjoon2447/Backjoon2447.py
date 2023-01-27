def starboxMaker(row, col, N): 
    if ((row // N) % 3 == 1 and (col // N) % 3 == 1):
        print(" ",end="")
    else:
        if (N // 3 == 0):
            print("*",end="")
        else:
            starboxMaker(row, col, N // 3)

N = 27

for i in range(0, N):   
	for j in range(0, N):
		starboxMaker(i, j, N)
	print("")