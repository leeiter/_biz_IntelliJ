public class Main_01 {

    // main
    public static void main(String[] args) {
        // soutp
        System.out.println("안녕하세요");

        MyKtClass myKtClass = new MyKtClass();
        String strName = myKtClass.name();

        System.out.printf("나의 이름은 %s 입니다", strName);
    }

}
