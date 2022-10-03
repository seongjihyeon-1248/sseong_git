count = 0
def isPromising(q, n):
    for i in range(0, n):
        if (q[i] == q[n]): 
            return 0   # 같은 열인지
        if ((q[i] - q[n]) == (n - i)): 
            return 0   # '\' 방향
        if ((q[n] - q[i]) == (n - i)): 
            return 0   # '/' 방향
    return 1

def enumerate(q, n, N):   # q[] -> 해당 인덱스 행에서 놓은 위치, n -> 채워진 행 개수
    if (n == N):       # n이 끝까지 돌았다면 카운트를 증가한다.
        count += 1
    else:
        for i in range(0, N):
            q[n] = i
            print(q)
            if (isPromising(q, n) == 1):
                enumerate(q, n + 1, N)   # 유망하다면 계속 탐색(재귀호출)
            
N = 8
q = list()
for i in range(0, N):
    q.append(0)
enumerate(q, 0, N)
print(count)