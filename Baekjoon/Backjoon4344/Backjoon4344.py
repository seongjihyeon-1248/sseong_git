n = [5,50,50,70,80,100]
Nn = list()
sum = 0.0
over = 0.0
for i in range(1,n[0]):
    sum += n[i]
    Nn.append(n[i])

for i in range(1,n[0]):
    if(sum / n[0] < n[i]):
        over += 1.0; 

print(over/n[0]*100,"%",sep="")