package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child(); // parent에 자식 인스턴스도 만들었고
        Child child1 = (Child) parent1; // child의 기능도 쓰고 싶으니까 캐스팅을 한거고
        child1.childMethod(); // 문제 없음 (child 기능 사용됨)

        Parent parent2 = new Parent(); // Parent만 생성되지 Child 인스턴스는 없음
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException (왜냐면 자식 인스턴스가 없으니까)
        child2.childMethod(); // 사용할 수 없는 타입으로 다운캐스팅
    }
}