T = 3

x1 = [0, 0, 1]
y1 = [0, 0, 1]
r1 = [13, 3, 1]
x2 = [40, 0, 1]
y2 = [0, 7, 1]
r2 = [37, 4, 5]

for i in range(0, T):
    r = (x1[i] - x2[i]) ** 2 + (y1[i] - y2[i]) ** 2
    if((r1[i] - r2[i]) ** 2 < r < (r1[i] + r2[i]) ** 2):
        print("2")
    elif(r == (r1[i] + r2[i]) ** 2 or r == (r1[i] - r2[i]) ** 2):
        if(x1[i] == x2[i] and y1[i] == y2[i]):
            print("-1") 
        else:
            print("1")
    else:
        print("0")