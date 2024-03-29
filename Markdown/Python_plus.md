# 파이썬

## 연산자

**            제곱
round(수, 반올림할 자리)            반올림 방법1
format(수, ".소수점 자리수f")       반올림 방법2

## 출력

    숫자는 ""필요 없음
    문자열은 ""필요함
    print는 출력 후 한 줄 개행
        print("~~~",end="\n\n") -> 기본 한 줄 개행에서 두 줄 개행으로 변경
        (줄 개행이 필요하지 않다면 ""으로)
    출력할 내용은 ,를 이용하여 입력
        ,는 공백을 의미
        print("~~~",~~~",sep="_") -> 기본 공백 하나에서 _으로 변경

## 연산자

    증감 연산자가 없음
    && 연산자가 아니라 and 사용
    || 연산자가 아니라 or 사용
    몫은 //

## 리스트

* 리스트의 기본 성질
    리스트이름 = list()
        ex) list = list(range(1,4))
    리스트이름 = []
        ex) list = [1, 2, 3]
    빈 리스트도 생성 가능
    모든 자료형 혼합 가능
    문자열을 생성할 때는 ""로 선언 가능

* 파이썬의 리스트의 활용
    리스트이름[시작:끝]
        시작 인덱스 부터 끝 인덱스 전까지(시작과 끝이 빌 수 있다)
    len(리스트 이름)
        리스트 길이
    del 리스트이름[시작:끝]
        시작 인덱스 부터 끝 인덱스 전까지(시작과 끝이 빌 수 있다) 삭제
    sorted(리스트)
        정렬된 리스트 반환
    reversed(리스트)
        뒤집은 리스트 반환
    리스트이름.append(추가할 요소)
        추가할 요소를 리스트의 맨 끝에 추가한다.
    리스트이름.sort()
        리스트 정렬
    리스트이름.sort(reverse=True)
        리스트 역정렬
    리스트이름.reverse()
        리스트 뒤집기
    리스트이름.index(찾는 요소)
        찾는 요소의 인덱스 값(찾는 요소가 여러 개 있으면 최소 인덱스 값) 반환
    리스트이름.index(찾는 요소, 시작, 끝)
        시작 ~ 끝 사이의 찾는 요소의 인덱스 값(찾는 요소가 여러 개 있으면 최소 인덱스 값) 반환
    리스트이름.insert(인덱스 값, 삽입할 요소)
        해당 인덱스에 요소를 삽입한다. 삽입 후 다른 인덱스 값들은 뒤로 밀린다.
    리스트이름.remove(삭제할 요소)
        리스트에서 가장 앞에 있는 삭제할 요소를 찾아 제거한다.
    리스트이름.pop()
        맨 마지막 요소 반환 및 삭제
    리스트이름.count(찾는 요소)
        찾는 요소의 개수 반환
    리스트이름.extend(추가할 리스트)
        리스트에 리스트를 추가하여 확장
        리스트이름 += 리스트   와도 기능이 같음
        ex) list.extend([1,2,3])
        ex) list.extend(list_2)
    max(list)
        리스트의 최댓값
    min(list)
        리스트의 최솟값
    if item in list:
        리스트에 (item)이 있는 지 확인
    결과 리스트 = list(set(리스트 1) | set(리스트 2))
        리스트 두 개를 비교하여 합집합 부분을 결과리스트애 저장
        교집합 -> &     차집합 -> -     대칭차집합 -> ^

## if문

    if 조건:
    elif 조건:
    else:

## for문

    for 변수 in 리스트:

## 입출력을 빠르게 하는 방법

    input -> sys.stdin.readline (맨 끝의 개행 문자까지 읽어버리니 .rstrip()을 추가해주는 것이 좋다.)

## 랜덤

    random.randrange(0, 정수) 0이상 '정수' 미만의 정수 리턴