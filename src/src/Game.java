public class Game {
    public int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
}
