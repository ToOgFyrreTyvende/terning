package terning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    Dice dice = new Dice();

    @org.junit.jupiter.api.Test
    void roll() {
        //Vi tester at terning bliver kastet 1000 gange, og at tallet kun skal være mellem 1 og 6.
        for (int i = 0; i < 1000; i++) {
            int roll = dice.roll();
            assertTrue(roll <= 6 && roll >= 1);
        }
    }

    @Test
    void roll1() {

        // Initialization of the different resulting rolls
        int et = 0, to = 0, tre = 0, fire = 0, fem = 0, seks = 0;

        // We roll 60000 times and split the results into their respective groups
        int rolls = 60000;

        for (int i = 0; i <= rolls; i++) {
            int roll = dice.roll();

            if(roll == 1){
                et = et + 1;
            }
            else if(roll == 2){
                to = to + 1;
            }
            else if(roll == 3){
                tre = tre + 1;
            }
            else if(roll == 4){
                fire = fire + 1;
            }
            else if(roll == 5){
                fem = fem + 1;
            }
            else if(roll == 6){
                seks = seks + 1;
            }

            // On the last run, we print out the resulting roll spread
            if(i == rolls){
                System.out.println("1 " + et + "\n" + "2 " + to + "\n" + "3 " + tre + "\n" +
                        "4 " + fire + "\n" + "5 " + fem + "\n" + "6 " + et + "\n");
            }

        }

        // when all roll groups have been created, we test if each and every one is within 400 of
        // 60000/6, since that would be the probabilistic average
        assertTrue(et >= 10000 - 400 && et <= 10000 + 400);
        assertTrue(to >= 10000 - 400 && et <= 10000 + 400);
        assertTrue(tre >= 10000 - 400 && et <= 10000 + 400);
        assertTrue(fire >= 10000 - 400 && et <= 10000 + 400);
        assertTrue(fem >= 10000 - 400 && et <= 10000 + 400);
        assertTrue(seks >= 10000 - 400 && et <= 10000 + 400);
    }
}