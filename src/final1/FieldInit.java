package final1;

public class FieldInit {
    // 초기값을 넣은 경우 생성자를 통해 값을 넣을 수 없음
    // 2. 개선책 (static)
    static final int CONST_VALUE = 10;
    // 1. 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리 낭비하게 됨
    final int value = 10;
}
