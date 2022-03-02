# 자바
------------------------
### 자바의 구성
    package 패키지 이름;
    public class 클래스 이름{
        public static void main(String args[]){
        }                                   
    }
    의 구조가 일반적

### 자바의 출력
    Syㅋㅋstem.out.print(출력할 내용); -> 줄 개행 x
    System.out.println(출력할 내용); -> 줄 개행 O
    출력할 내용은 +를 이용하여 입력

### 자바의 배열
    자료형[] 변수이름 = new 자료형[배열의 크기]; (초기화 필요)
    자료형[] 변수이름 = {};

### 입출력을 빠르게 하는 방법
    Scanner -> BufferedReader
    System.out.println -> BufferedWriter