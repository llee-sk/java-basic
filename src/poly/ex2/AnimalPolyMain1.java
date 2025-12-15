package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        // 다형성 참조로 인해 animal은 자식의 메서드 호출이 가능함
        // 동물을 새로 추가하더라도 animal을 상속받고 오버라이딩한다면 animal은 그 클래스의 메서드 호출 가능함 (중복 제거)
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 부모는 자식을 담을 수 있음
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
