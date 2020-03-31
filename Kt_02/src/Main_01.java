public class Main_01 {

    public static void main(String[] args) {

        int start = 0;
        int end = 100;
        int sum = 0;

        // 짝수만 더하기
        for (int i = start ; i <= end ; i++) {

            if(i % 2 == 0) {
                sum += i;
            }

        }

        // 짝수만 더하기
        for (int i = start ; i <= end ; i += 2) {

            sum += i;

        }

        // 역순으로 보여주기
        for (int i = end ; i >= start ; i--) {
            System.out.println("값 : " + i);
        }

    }

}
