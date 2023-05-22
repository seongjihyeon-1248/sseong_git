n = 25
m = 12
count = 0
while (n >= 5):
    count += n // 5
    n //= 5
while (m >= 5):
    count -= 2 * (m // 5)
    m //= 5
print(count)