import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("게임에 참여할 금액을 입력하세요.");
        int initialMoney = scanner.nextInt();

        Player player = new Player(initialMoney);
        Game game = new Game();
        Betting betting = new Betting();

        while (true) {
            System.out.println("현재 잔액: " + player.getMoney());

            if (player.getMoney() <= 0) {
                System.out.println("잔액이 부족합니다. 게임을 종료합니다.");
                break;
            }

            int bettingMoney = betting.betMoney();
            String evenOdd = betting.chooseEvenOdd();
            int diceNumber = game.rollDice();
            String result = game.checkEvenOdd(diceNumber);

            if (result.equals(evenOdd)) {
                player.setMoney(player.getMoney() + bettingMoney * 2);
                betting.showResult(true, bettingMoney, player.getMoney());
            } else {
                player.setMoney(player.getMoney() - bettingMoney);
                betting.showResult(false, bettingMoney, player.getMoney());
            }

        }

    }
}