#https://school.programmers.co.kr/learn/courses/30/lessons/132265
# 시간 초과 해결 못함...

from collections import Counter

def solution(topping):
    return ans(topping, 0, len(topping) - 1)

def ans(topping, min, max):
    if(max < min): 
        return 0
    mid = (min + max) // 2
    len_min = len(Counter(topping[:mid]))
    len_max = len(Counter(topping[mid:]))
    if(len_min > len_max):
        return ans(topping, min, mid - 1)
    elif(len_min < len_max):
        return ans(topping, mid + 1, max)
    else:
        return 1 + ans(topping, min, mid - 1) + ans(topping, mid + 1, max)
    

print(solution([1, 2, 1, 3, 1, 4, 1, 2]))