# 자바

## 구성

    package 패키지 이름; -> package 안에 들어있으면 클래스 모두 이용 가능
    public class 클래스 이름{ 
        public static void main(String args[]){ -> 실행되는 main
        }                                   
    }
    의 구조가 일반적

## 출력

    System.out.print(출력할 내용); -> 줄 개행 x
    System.out.println(출력할 내용); -> 줄 개행 O
    출력할 내용은 +를 이용하여 입력

## 연산자

    Math.pow(밑, 지수);
        제곱

## 배열

    자료형[] 변수이름 = new 자료형[배열의 크기]; (초기화 필요)
    자료형[] 변수이름 = {};

    Arrays.sort(배열)
        배열 정렬

    arrayList -> 동적배열이라고 생각하면 편하고 파이썬의 리스트와 거의 동일
    ArrayList<타입> n = new ArrayList<타입>();
    ArrayList<타입> n = new ArrayList<타입>(인덱스 수 지정);
        Arraylist 생성
    ex.ArrayList<Integer> n = new ArrayList<Integer>();
       ArrayList<타입> n = new ArrayList<타입>(Arrays.asList(1,2,3); -> 값 추가하면서 생성
    list.add(index,value), list.add(value), list.add(null)
        값 추가
    ex)ArrayList<타입[]> list = new ArrayList<타입[]>();
        이중 배열(배열을 인수로 가지는 ArrayList)
    list.add(new Integer[]{value_1, value_2..., value_n});
        이중 배열 값 추가
    list.remove(index)
        index 제거
    list clear()
        리스트 모든 값 제거
    list.size()
        리스트 크기
    list.get(인덱스)
        해당 인덱스의 값 가져오기
    ex. for(Integer i : list) 
        for문을 이용하는 예시
    System.out.println(list.contains(검색할 값)) -> 없으면 false, 있다면 true 반환
    //문자열 포함 확인
    System.out.println(list.indexOf(검색할 값)) -> 없으면 -1, 있다면 인덱스 값 반환
    list.retainAll(리스트)
        두 리스트의 교집합 구하여 list에 저장
    list.removeAll(리스트)
        두 리스트의 차집합 구하여 list에 저장
    list.addAll(리스트)
        두 리스트의 합집합 구하여 list에 저장 (중복도 두 번 저장된 주의)
    Collections.sort(리스트);
        리스트 정렬
    Collections.sort(리스트, Collections.reverseOrder())
        리스트 역정렬
    (String::length);
        문자열 리스트를 길이를 기준으로 정렬
    Collections.max(리스트)
        리스트 최대값
    Collections.min(리스트) 
        리스트 최소값

## 문자열

    String 변수이름 = " "
    a.length()
        문자열 길이
    문자열 변수이름.charAt(인덱스)
        해당 인덱스의 문자

## 입출력을 빠르게 하는 방법

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    Integer.parseInt(st.nextToken())

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("");
    bw.flush();
    bw.close();

    StringBuilder sb = new StringBuilder();
    sb.append((nn.get(a))).append("\n")

## 랜덤

    random.nextInt(정수)        0 이상, '정수' 미만인 정수 리턴
    random.nextFloat()          float값
    random.nextDouble()         double값
    random.nextBoolean()        boolean값

## 맵

    (키, 값) 구조
    import java.util.HashMap;
    HashMap<자료형1, 자료형2> 맵 = new HashMap<>();
    for (자료형1 key : 맵.keySet())
    앱.get(인덱스)
