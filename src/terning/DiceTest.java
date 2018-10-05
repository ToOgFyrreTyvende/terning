package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    Dice dice = new Dice();

    @org.junit.jupiter.api.Test
    void roll() {
        //Vi tester at terning bliver kastet 1000 gange, og at tallet kun skal være mellem 1 og 6.
        for (int i=0;i<1000;i++) {
            int roll = dice.roll();
            assertTrue(roll <= 6 && roll >= 1);
        }
    }
}