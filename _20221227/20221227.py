#https://school.programmers.co.kr/learn/courses/30/lessons/138476

from collections import Counter

def solution(k, tangerine):
    answer = 0
    count = sorted(Counter(tangerine).values(), reverse = True)
    for i in count:
        k -= i
        answer += 1
        if k <= 0:
            break
    return answer

print(solution(6, [1, 3, 2, 5, 4, 5, 2, 3]))