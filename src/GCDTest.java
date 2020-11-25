import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {
    private void createGcdAndAssertValue(int i, int i1, int expectedValue) {
        try {
            int actualValue = GCD.findGCD(i, i1);
//            assertEquals(expectedValue, actualValue);
            Assert.assertEquals(expectedValue,actualValue);

        } catch (Exception e) {
//            assertEquals("input out of range", e.getMessage());
            Assert.assertEquals("input out of range", e.getMessage());

        }

    }
    

    int min = 1, max = 100, nom = 50, justAboveMin = 2, justBelowMax = 99, nom1 = 51, justBelowMin = 0, justAboveMax = 101;

    @org.junit.Test
    public void findGCD_BVC1() {
        createGcdAndAssertValue(nom1, justBelowMax, 3);

    }

    @Test
    public void findGCD_BVC2() {
        createGcdAndAssertValue(nom, min, 1);

    }

    @Test
    public void findGCD_BVC3() {
        createGcdAndAssertValue(nom, max, 50);

    }

    @Test
    public void findGCD_BVC4() {
        createGcdAndAssertValue(nom, nom1, 1);

    }

    @Test
    public void findGCD_BVC5() {
        createGcdAndAssertValue(nom, justAboveMin, 2);

    }

    @Test
    public void findGCD_BVC6() {
        createGcdAndAssertValue(nom, justBelowMax, 1);

    }

    @Test
    public void findGCD_BVC7() {

        createGcdAndAssertValue(nom1, min, 1);

    }

    @Test
    public void findGCD_BVC8() {
        createGcdAndAssertValue(nom1, max, 1);

    }

    @Test
    public void findGCD_BVC9() {
        createGcdAndAssertValue(nom1, justAboveMin, 1);
    }
}