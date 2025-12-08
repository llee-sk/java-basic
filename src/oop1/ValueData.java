package oop1;

public class ValueData {
    int value;

    // 클래스에 해당 데이터를 사용하는 기능인 메서드를 함께 정의함
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
