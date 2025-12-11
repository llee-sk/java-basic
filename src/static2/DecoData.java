package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue++; // 인스턴스 변수 접근, 컴파일 에러 발생
        // instanceMethod(); // 인스턴스 메서드 접근, 컴파일 에러 발생

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public static void staticCall(DecoData data) {
        // 참조값이 있는 경우는 인스턴스 호출 가능
        data.instanceValue++; // data는 외부에서 참조값으로 넘겨와져서 call 가능
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
