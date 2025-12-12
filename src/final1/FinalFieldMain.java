package final1;

import java.util.Arrays;

public class FinalFieldMain {
    public static void main(String[] args) {
        // 1. final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        // 생성자를 통해 값 초기화
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        // 2. final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        // 이미 필드에 초기화 되어있어서 초기화할 필요 없음
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        // 3. 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
