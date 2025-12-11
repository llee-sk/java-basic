package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello java";
        // 인스턴스 생성없이 정적 메소드에 접근
        String deco = DecoUtil2.deco(s);

        System.out.println("before s:" + s);
        System.out.println("after deco: " + deco);
    }
}
