// maina
// 진입점 method
fun main(args: Array<String>) {

    // 맨 마지막에 ; 없는 값이 기본 값.
    // 항상 맨 처음 시작할 때는 Alt+Shift+F10 으로 지정하고 실행해줘야 한다.
    println("반갑습니다. 나는 코틀린 입니다.")

    // 변수를 선언하면 값의 type에 따라 변수 형태가 정해짐
    // 추론형 type 결정 방식 변수 선언
    var intNum = 3
    var strName = "홍길동"

    // 변수를 선언할 때 반드시 값이 존재해야 한다.
    // 변수명만으로 변수를 선언할 수 없다.
    // var strNation
    var strNation = "대한민국"

    // 최소값을 무조건 있어야 한다.
    var intSum = 0
    var strName1 = ""

    // 원칙적으로 null값으로도 변수를 선언할 수 없다
    var strName2 = null

    // 명시적으로 변수 type을 결정할 수 있다.
    var intNum2 : Int = 0
    var intNum3 : Double = 3.0
    var intNum4 : String = "대한민국"

    // 명시적으로 변수 type을 결정하고
    // ?를 표기하면
    // 변수 초기화를 지연시켜서 나중에 값을 할당할 수
    // 있다.
    // 현재 이름만 생성되었다. 변수가 생성된 것은 아니다.
    var intNum5 : Int?

    println("숫자 : " + intNum)
    println("이름 : " + strName)

}