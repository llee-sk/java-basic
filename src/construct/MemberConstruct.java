package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 (오버로딩)
    MemberConstruct(String name, int age) {
        /*
        this.name = name;
        this.age = age;
        this.grade = 50;
        */
        // name,age가 중복되어 아래 MemberConstruct 호출하여 중복 제거
        this(name, age, 50); // this()는 첫번째 문장에서만 적용 가능
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
