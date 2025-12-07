package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // 인스턴스가 복사되는 것이 아닌 '참조값'만 복사 대입

        System.out.println("dataA 참조값 : " + dataA);
        System.out.println("dataB 참조값 : " + dataB);
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        // 참조값은 같은 곳을 바라보고 실제 인스턴스가 변경되어 동일한 값 출력
        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value : " + dataA.value);
        System.out.println("dataB.value : " + dataB.value);
    }
}
