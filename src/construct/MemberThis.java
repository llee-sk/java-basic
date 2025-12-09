package construct;

public class MemberThis {
    // 생성자 생략 확인 코드
    // 최근에는 멤버 변수임을 색깔로 확인 가능하기 때문에 굳이 this.를 붙이지는 않음
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
