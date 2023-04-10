x = 161
y = 181
w = 762
h = 375

min = x

if(min > y):
    min = y
    
if(min > w - x):
    min = w - x
    
if(min > h - y):
    min = h - y

print(min)