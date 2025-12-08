package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 초기화 값 0
        System.out.println("bigData.data = " + bigData.data); // 초기화 값 null

        // NullpointerException
        // 해결 방법은 new data 생성하여 참조값 생성
        System.out.println("bigData.data.value = " + bigData.data.value); // null.value니까 오류
    }
}
