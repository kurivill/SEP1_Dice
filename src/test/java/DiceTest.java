import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    Dice dice = new Dice();

    @Test
    void testRoll() {
        dice.roll();
        assertTrue(dice.die1 >= 1 && dice.die1 <= 6);
        assertTrue(dice.die2 >= 1 && dice.die2 <= 6);
        assertEquals(dice.howManyRolls, 1);
    }

    @Test
    void testCheckDouble() {
        dice.testSetDice(1, 1);
        assertTrue(dice.checkDouble());
    }
}