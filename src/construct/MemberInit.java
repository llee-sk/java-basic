package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 기본 생성자 - 생성자가 없는 경우 보여지지 않아도 자바가 자동으로 아래 형식인 기본 생성자를 만들어줌
//    MemberInit() {
//    }

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
