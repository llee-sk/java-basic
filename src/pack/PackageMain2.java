package pack;

import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        // Data는 같은 패키지에 있음
        Data data = new Data();

        // import 사용하면 패키지명 생략하고, 클래스 명만 작성해서 사용 가능)
        User user1 = new User();
    }
}
