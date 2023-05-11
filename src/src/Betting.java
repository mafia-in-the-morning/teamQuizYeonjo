import java.util.Scanner;

public class Betting {
    public int betMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("얼마를 거시겠어요?");
        int bettingMoney = scanner.nextInt();
        return bettingMoney;
    }

    public String chooseEvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("홀/짝 중에 선택해주세요.");
        String evenOdd = scanner.next();
        return evenOdd;
    }

    public void showResult(boolean isWin, int bettingMoney, int resultMoney) {
        if (isWin) {
            System.out.println("맞췄습니다! " + bettingMoney * 2 + "원을 따셨습니다.");
            System.out.println("현재 잔액: " + resultMoney);
        } else {
            System.out.println("틀렸습니다. " + bettingMoney + "원을 잃으셨습니다.");
            System.out.println("현재 잔액: " + resultMoney);
        }
    }
}