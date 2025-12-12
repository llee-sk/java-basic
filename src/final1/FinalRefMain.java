package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data(); // 참조형 final 선언
//        data = new Data(); // 이미 할당을 했기 때문에(final) 참조 대상을 변경할 수 없음

        // 참조 대상의 객체의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);

        data.value = 20;
        System.out.println(data.value);

    }
}
