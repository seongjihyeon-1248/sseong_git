# https://school.programmers.co.kr/learn/courses/30/lessons/138475?language=python3
# 시간 초과 해결 못함...

import math

def solution(e, starts):
    answer = []
    count_list = []
    count_list.append(1)
    for count in range(2, e + 1):
        cnt = 0
        for c in range(1, math.floor(count**(1/2)) + 1):
            if(count % c  == 0):
                  cnt += 2
        if(math.floor(count**(1/2))**2 == count): 
            cnt -= 1
        count_list.append(cnt)
    for s in starts:
        answer.append(count_list[s - 1:e].index(max(count_list[s - 1:e])) + s)
    return answer
    
print(solution(8, [1, 3, 7]))