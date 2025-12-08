package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        // 절차형 프로그래밍을 하되, 데이터를 묶어서 좀 더 편리하게 관리하는 방법으로 작성
        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨 : " + data.volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 : " + data.isOn);
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
