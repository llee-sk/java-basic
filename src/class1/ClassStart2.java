package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 직접 변수를 넣는 것 보단 코드변경을 최소화했지만, 배열 3개로 쪼개져 있어서 데이터 변경시 어려움이 있음
        // 예시) 학생 2의 점수를 변경할 때 정확한 인덱스의 값을 변경해야함
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {80, 90};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름 : " + studentNames[i] + " 나이 : " + studentAges[i] + " 점수 : " + studentGrades[i]);
        }
    }
}
