fun main(){
    var a = "test"
    println(a)
    /*
        !코틀린 기본 문법!
        .자바를 안다는 가정으로 필기.

        출력
            기본 출력       print
            줄 개행 출력    println

        변수 - 대게 선언과 동시에 초기화
            var 가변 변수
            val 불가변 변수
            문자열 합치기 
                $문자열명 문자열

        메소드
            ex1)fun 메소드명(변수명: 매개변수타입, ...): 리턴타입 { ... return 리턴값 }
            ex2)fun 메소드명(변수명: 매개변수타입, ...): 변수 = 할당할값            ...값 할당도 가능
            cf) 자바 void -> 코틀린 Unit

        집합
            배열        arrayOf(., .., ...)     -> 출력하면 깨짐 & 가변
            리스트      listOf(., .., ...)      -> 출력해도 안 깨짐 & 불가변        ...오류 방지용
            배열리스트  arraylistOf(., .., ...) -> 출력해도 안 깨짐 & 가변
            가변 집합 메소드(배열, 배열리스트)
                .add(요소)      요소 리스트 뒤에 추가
                .remove(요소)   해당 요소 삭제
                [인덱스값] = 설정할 값
                set(인덱스, 설정할 값)
            if문은 자바와 동일
            if식
                ex) val 변수 = if(조건) 값1 else 값2
            for문
                ex) for(i in 시작정수..마지막 정수){ ... }

        when문 (switch문과 비슷)
            ex) when(변수){ 
                    값1             -> 값1일 경우의 수행
                    값2,3           -> 값2나 값3일 경우의 수행
                    in 값4..값8     -> 값4~값8일 경우의 수행
                    !in 값5..값7    -> 값5~값7이 아닐 경우의 수행
                    else            -> 모두 아닐 경우 수행
                }
            ex2) val 변수 = when(변수){ ... }       ...값 할당도 가능

        클래스
            class 클래스명{ }
            생성자
                i) class 클래스명(var 변수명: 타입)   
                    var 타입 변수는 읽기쓰기타입
                    val 타입 변수는 읽기타입
                ii) init 메소드
                    ex) init{ }
            객체
                ex) val 변수명 = 클래스명(매개변수)
                객체.변수   특정 객체 클래스 변수 사용
            데이터 클래스
                ex) data class 클래스명{
                        val 변수: 변수타입
                        var 변수: 변수타입
                        ...
                    }
                출력 시 '클래스명(변수명=값 ...)' 로 출력됨
            자바와 구조 비교
                            상속            인터페이스          오버라이딩
                자바        extends ...     implements ...      @override
                코틀린      : ... ()        , ... . ...         override
        코틀린의 특징
            null값에 안전 more than 자바
                ?: null 가능
            확장함수: 클래스에 기능 추가 (코틀린의 가장 큰 장점)
                ex) fun 기존클래스명.메소드명(변수이름: 타입, ...): 리턴타입 = ...
            자바&코틀린 호환 가능(ex)코틀린 메인에서 자바 클래스 사용 가능)
        람다식 메소드
            기존.ver
                콘텍스트.setOnClickListener(object: View.OnClickListener{
                    override fun onClick(v: View?){
                        print("hello")
                    }
                })
            람다식.ver                                          ...입력 같은 필요 없는 것 생략 가능 (view 빋아오는 과정 생략)
                콘텍스트.setOnClickListener{ print("hello") }
    */
}