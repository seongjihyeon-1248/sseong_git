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

* 조건문
  * 1330  두 수 비교하기
  * 9498  시험 성적
  * 2753  윤년
  * 2884  알람 시계
* 반복문
  * for 문
    * 2739  구구단
    * 2741  N찍기
    * 2438  별 찍기 - 1
    * 2439  별 찍기 - 2
  * while 문
    * 15552 빠른 A+B
    * 10871 X보다 작은 수
    * 10951 A+B - 4
    * 1110  더하기 사이클
* 1차원 배열
  * 10818 최소, 최대
  * 2562  최댓값
  * 1546  평균
  * 4344  평균은 넘겠지
* 함수
  * 4673  셀프 넘버
  * 1065  한수
* 문자열
  * 11720 숫자의 합
  * 10809 알파벳 찾기
  * 1157  단어 공부
  * 1152  단어의 개수
* 기본 수학 1
  * 1712  손익분기점
  * 2869  달팽이는 올라가고 싶다
  * 10250 ACM 호텔
  * 2839  설탕 배달
* 기본 수학 2
  * 1978  소수 찾기
  * 2581  소수
  * 1929  소수 구하기
  * 4948  베르트랑 공준
* 재귀
  * 10872 팩토리얼
  * 10870 피보나치 수 5
  * 2447 별 찍기 10
  * 11729 하노이 탑 이동 순서
* 브루트 포스
  * 2798  블랙잭
  * 2231  분해합
* 정렬
  * 2750  수 정렬하기
  * 2751  수 정렬하기 2
  * 10989 수 정렬하기 3
  * 1181  단어 정렬
* 집합과 맵
  * 10815 숫자 카드
  * 1620  나는야 포켓몬 마스터 이다솜
  * 10816 숫자 카드 2
  * 1764  듣보잡
* 기하 1
  * 1085  직사각형에서 탈출
  * 4153  직각삼각형
  * 3053  택시 기하학
  * 1002  터렛
* 정수론 및 조합론
  * 1037  약수
  * 2609  최대공약수와 최소공배수
  * 1934  최소공배수
  * 2981  검문
  * 11051 이항 계수 2
  * 1010  다리놓기
  * 1676  팩토리얼 0의 개수
  * 2004  조합 0의 개수
* 백트래킹
  * 15649
  * 15650
  * 9663
  * 14888

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