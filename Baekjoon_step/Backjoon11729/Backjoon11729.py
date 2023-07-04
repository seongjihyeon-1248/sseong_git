def move(N, start, end, sub):
    if(N == 1):
        print(start, end)
        return 
        
    move(N-1, start, sub, end); # 가장 큰 원판을 제외한 N-1개의 원판을 서브 타워에 정리
    move(1, start, end, sub); # 큰 원판을 엔드 위치에 옮김
    move(N-1, sub, end, start); # 위에 정리한 N-1개의 원판을 end 옮기기

N = 3
print(2 ** N - 1)
move(N, 1, 3, 2)