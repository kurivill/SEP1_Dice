import java.util.Random;

public class Dice {

    public int die1;
    public int die2;
    public boolean isDouble = false;
    public int howManyRolls = 0;

    public Dice() {
    }

    public void roll() {
        die1 = new Random().nextInt(6) + 1;
        die2 = new Random().nextInt(6) + 1;
        howManyRolls++;
        isDouble = checkDouble();
    }

    public boolean checkDouble() {
        if (die1 == die2) {
            System.out.println("A double!");
            return true;
        } else {
            return false;
        }
    }

    public void testSetDice(int die1, int die2) {
        this.die1 = die1;
        this.die2 = die2;
    }
}
