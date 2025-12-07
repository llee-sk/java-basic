package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 기본형의 변수의 대입
        int a = 10;
        int b = a; // 변수 a에 들어있는 값 (10)을 '복사'해서 전달

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
