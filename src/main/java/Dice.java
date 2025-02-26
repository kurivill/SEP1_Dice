import java.util.Random;

public class Dice {

    private int die1;
    private int die2;
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

    public static void main(String[] args) {
        Dice dice = new Dice();
        while (!dice.isDouble) {
            System.out.println("Rolling the dice...");
            dice.roll();
            System.out.println("Die 1: " + dice.die1 + " Die 2: " + dice.die2);
        }
        System.out.println("It took " + dice.howManyRolls + " rolls to get a double.");
    }
}
