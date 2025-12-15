package poly.ex3;

public abstract class AbstractAnimal { // 추상클래스
    // [추상 메서드] 자식 오버라이딩 목적으로 만듦
    // 자식은 반드시 오버라이딩 해야함
    public abstract void sound(); // 바디가 없으니 호출이 되면 안됨

    // 자식에게 상속하는 목적으로 만듦
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
