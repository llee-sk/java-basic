package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        // Data는 같은 패키지에 있음
        Data data = new Data();

        // 다른 패키지에 있는 클래스 호출
        pack.a.User user = new pack.a.User();
    }
}
