list = [[6, 8, 10], [25, 52, 60], [5, 12, 13], [0, 0, 0]]

i = 0
while(1):
    list[i].sort()
    if(list[i][0] ** 2 + list[i][1] ** 2 == list[i][2] ** 2):
        if(list[i][2] == 0):
            break
        print("right")
    else:
        print("wrong")
    i += 1