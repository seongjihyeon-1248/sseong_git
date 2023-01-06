#https://school.programmers.co.kr/learn/courses/30/lessons/132265

from collections import Counter

def solution(topping):
    answer = 0
    dic = Counter(topping)
    set_dic = set()
    for i in topping:
        if dic[i] == 1:
            dic.pop(i)
        else:
            dic[i] -= 1
        set_dic.add(i)
        if len(dic) == len(set_dic):
            answer += 1
    return answer
 
print(solution([1, 2, 1, 3, 1, 4, 1, 2]))