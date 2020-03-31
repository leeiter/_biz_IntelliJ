public class Main_02 {

    public static void main(String[] args) {

        // interface로 클래스를 선언하지 않고
        // 필요할 때 직접 클래스를 정의하여 사용하는 방법
        // 익명 클래스 사용
        MyInter nameObj = new MyInter() {

            @Override
            public String name() {

                return "홍길동";

            }

        };

        String nameStr = nameObj.name(); // "이몽룡"

        String nameStr1 = sub(new MyInter() {

            @Override
            public String name() {

                // 2. 실질적으로는 return 값이 일을 한다.
                // 결과만 한다.
                return "성춘향";

            }

        });

        /*
            java 1.8 이상에서 인터페이스를 익명클래스로 생성하는
            lambda 방식
            () : method 식별자
            -> : method 본체를 가리키는 화살표 함수
            {} : 구현코드
         */
        String nameStr2 = sub(() -> {

            return "이몽룡";

        });

    }

    // 1. 하는 일이 없는 함수를 만들어놓고
    public static String sub(MyInter inter) {

        return inter.name();

    }

}
