# *CODING && COMPUTER*

## code && git

* git push
    git add -A
    git commit -m "커밋 이름"
    git push

* git pull
    git pull

## Visual Stdio Code 이용 규칙

1. java     F5          디버그 안 될 경우 "public static void main(String args[])"확인
                        class 찾을 수 없다는 경우 터미널에 java clean
2. c        Run_code
3. python   Run_code
4. kotlin   Run_code

## 링크

* Administrator, 레지스트리 - <https://injunech.tistory.com/308>
* VS 코드에서 깃 연동 - <https://jalbin.tistory.com/20>
* md 기본 사용법 - <https://gist.github.com/ihoneymon/652be052a0727ad59601>
* 코딩 주제 추천 - <https://rladuddms.tistory.com/99>
* python 설명 - <https://wikidocs.net/4307>

## 코딩 테스트 주제

* most
  * DFS, BFS
  * 투 포인터
  * 최단거리
  * 문자열
  * 이분탐색
* more
  * 브루트포스
  * 다이나믹 프로그래밍
  * 시뮬레이션
* basic
  * 순열조합 활용
  * 진법
  * Union Find
* etc
  * Trie
  * Flood fill
  * 미트 마스킹
  * 위상 정렬
  * 세그먼트 트리

## Backjoon 문제 유형 정리

* 입출력과 사칙연산
  * 2557  Hello World
  * 1000  A+B
  * 1008  A/B
  * 10171 고양이
* 조건문
  * 1330  두 수 비교하기
  * 2884  알람 시계
* 반복문
  * 2739  구구단
  * 2438  별 찍기 - 1
  * 2439  별 찍기 - 2
  * 10951 A+B - 4
* 1차원 배열
  * 10871 X보다 작은 수
  * 10818 최소, 최대
  * 2562  최댓값
* 문자열
  * 11720 숫자의 합
  * 1152  단어의 개수
  * 11718 그대로 출력하기
* 심화 1
  * 1157  단어 공부
  * 4344  평균은 넘겠지
  * 2941  크로아티아 알파벳
* 2차원 배열
  * 2738  행렬 덧셈
* 일반 수학 1
  * 2869  달팽이는 올라가고 싶다
* 약수, 배수와 소수
  * 1978  소수 찾기
  * 2581  소수
* 기하: 직사각형과 삼각형
  * 1085  직사각형에서 탈출
  * 3009  네 번째 점
  * 10101 삼각형 외우기
* 브루트 포스
  * 2798  블랙잭
  * 2839  설탕배달
* 정렬
  * 2750  수 정렬하기
  * 2751  수 정렬하기 2
  * 10989 수 정렬하기 3
  * 1181  단어 정렬
* 집합과 맵
  * 10815 숫자 카드
  * 10816 숫자 카드 2
  * 1764  듣보잡
* 약수, 배수와 소수 2
  * 1934  최소공배수
  * 1929  소수 구하기
  * 4948  베르트랑 공준

* BFS
  * 1260 DFS와 BFS
  * 2178 미로 탐색
  * 2606
  * 2667
  * 1697
  * 7562
* DFS
  * 1260 DFS와 BFS
  * 2606
  * 2667
  
## c언어

* 동적 배열

    ```c
    int*n = (int*)malloc(sizeof(int) * N);
    ```

* 동적 문자열 2차원 배열

    ```c
    char **n = (char**)malloc(sizeof(char*) * N);
    ```

    ```c
    for(int i = 0; i < N; i++)
        n[i] = (char*)malloc(sizeof(char) * 50);
    ```

* 문자열 길이

    ```c
    #include <string.h> 
    strlen(문자열)
    ```