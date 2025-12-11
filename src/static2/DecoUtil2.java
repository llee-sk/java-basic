package static2;

public class DecoUtil2 {
    public static String deco(String str) {
        //메서드에 static 붙임 = 정적 메서드
        // 인스턴스 생성없이 바로 접근 가능
        return "*" + str + "*";
    }
}
