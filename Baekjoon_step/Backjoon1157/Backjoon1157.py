a = "Mississipi"
alphabet = [0 for i in range(26)]
small = "abcdefghijklmnopqrstuvwxyz"
big = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for ii in range(0, 26):
    alphabet[ii] += (a.count(small[ii]) + a.count(big[ii]))

i = 0
if(alphabet.count(max(alphabet)) > 1):
    print("?")
else:
    print(big[alphabet.index(max(alphabet))])