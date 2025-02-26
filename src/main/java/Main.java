public class Main {

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
